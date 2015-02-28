
package org.xiaoqiaotq.controller.test; 
 
import java.util.Map; 
 




import javax.swing.border.Border;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.util.CellRangeAddress; 
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.util.RegionUtil;
import org.xiaoqiaotq.model.Student; 
 




import net.sf.jxls.processor.RowProcessor; 
import net.sf.jxls.transformer.Row; 
import net.sf.jxls.transformer.RowCollection; 
 
public class MyRowProcessor implements RowProcessor { 
     //集合名字
     String collectionName;
     //集合长度
     int size;
     // 集合下标
     int collectionIndex;
     
     //集合分组数组     rowNums[index]=rowNum; 
     int[] rowNums;
     //集合分组下标
     int index=0; 
     
     //分组标识
     Integer preGroupId; 
     
     //年龄累加
     int aggreateAge;
 
    public MyRowProcessor(String collectionName,int size) { 
        this.collectionName = collectionName; 
        rowNums=new int[size]; 
        this.size=size;
    } 
 
    public void processRow(Row row, Map namedCells) { 
        Sheet sheet=row.getPoiRow().getSheet(); 
        if( row.getParentRow()!=null ){ 
            RowCollection rowCollection = row.getParentRow().getRowCollectionByCollectionName( collectionName ); 
            if( rowCollection.getIterateObject() instanceof Student){ 
            	collectionIndex++;
                Student student = (Student) rowCollection.getIterateObject(); 
                Integer studentId=student.getId();
                
                int age=student.getAge();
                aggreateAge=aggreateAge+age;
                
                int rowNum=row.getPoiRow().getRowNum()+1; 
                //分组表示不一致
                if(!studentId.equals(preGroupId)){ 
                    rowNums[index]=rowNum; 
                    if(index>0){ 
                    	//合并分组
                    	sheet.addMergedRegion(CellRangeAddress.valueOf("B"+rowNums[index-1]+":B"+(rowNums[index]-1)));
                    	
                    	Cell cell = mergeRangedCell(sheet, "I"+rowNums[index-1]+":J"+(rowNums[index]-1));
                        //设置cell值
                        cell.setCellValue(aggreateAge-age);
                        //重新计算aggregate
                        aggreateAge=age;
                    } 
                    // 集合分组下标 加1
                    index++; 
                    // 改变分组标识
                    preGroupId=studentId;
                    if(isLastRow()){
                        sheet.addMergedRegion(CellRangeAddress.valueOf("B"+rowNum+":B"+rowNum)); 
                        
                        Cell cell = mergeRangedCell(sheet, "I"+rowNum+":J"+rowNum);
                        //设置cell值
                        cell.setCellValue(age);
                        
                    }
                }
                if(isLastRow()){
                	sheet.addMergedRegion(CellRangeAddress.valueOf("B"+rowNums[index-1]+":B"+rowNum)); 
                	
                    Cell cell = mergeRangedCell(sheet, "I"+rowNums[index-1]+":J"+rowNum);
                    //设置cell值
                    cell.setCellValue(age);
                }
            } 
        } 
    }

	/**
	 * 
	 * 合并单元格  并格式化
	 * @param sheet
	 * @param rangeAddress
	 * @return
	 */
	private Cell mergeRangedCell(Sheet sheet, String rangeAddress) {
		CellRangeAddress countRange=CellRangeAddress.valueOf(rangeAddress);
		sheet.addMergedRegion(countRange); 
		//aggregate
		CellReference cellRef=new CellReference(rangeAddress.substring(0,rangeAddress.indexOf(":")));
		Cell cell=sheet.getRow(cellRef.getRow()).getCell(cellRef.getCol(),org.apache.poi.ss.usermodel.Row.CREATE_NULL_AS_BLANK);
		//添加合并单元格边框
		RegionUtil.setBorderTop(CellStyle.BORDER_THIN, countRange, sheet, sheet.getWorkbook());
		RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, countRange, sheet, sheet.getWorkbook());
		//添加垂直,水平居中
		CellStyle cellStyle = cell.getCellStyle();
		cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
		cellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		cellStyle.setBorderTop(CellStyle.BORDER_THIN);
		cell.setCellStyle(cellStyle);
		return cell;
	} 
	/**
	 * 
	 */
    boolean isLastRow(){
    	return size == collectionIndex;
    }
} 