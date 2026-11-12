package com.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.Exception;

import com.b745utility.DBConnection;
import com.student.model.Student;

public class StudentDAO implements StudentDAOInterface {

	Connection con=null;
	String status="failed";
	
	@Override
	public void insertStudent(Student s) {
		try {
			
			con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, s.getStno());
			ps.setString(2, s.getStname());
			ps.setInt(3, s.getMarks());
			int n=ps.executeUpdate();
			
			if(n>0) {
				System.out.println("Insert successfully");
			}else {
				System.out.println("something went wrong");
			}
			ps.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void getStudents() {
		try {
			con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select stno,stname,marks from student");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("stno")+"-"+rs.getString("stname")+"-"+rs.getInt("marks"));
			}
			rs.close();
	        ps.close();
	        con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void getStudentBYID(int stno) {
		try (
			    Connection con = DBConnection.getConnection();
			    PreparedStatement ps = con.prepareStatement(
			        "select stno, stname, marks from student where stno=?"
			    )
			) {
			    ps.setInt(1, stno);

			    try (ResultSet rs = ps.executeQuery()) {
			        while (rs.next()) {
			            System.out.println(
			                rs.getInt("stno") + "-" +
			                rs.getString("stname") + "-" +
			                rs.getInt("marks")
			            );
			        }
			    }

			} catch (Exception e) {
			    System.out.println(e);
			}
		}
	
	@Override
	public String updateStudent(int stno, Student s) {

	    String status;

	    try (
	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps = con.prepareStatement(
	            "UPDATE student SET stname=?, marks=? WHERE stno=?"
	        )
	    ) {

	        ps.setString(1, s.getStname());
	        ps.setInt(2, s.getMarks());
	        ps.setInt(3, stno);

	        int n = ps.executeUpdate();

	        if (n > 0) {
	            status = "Updated successfully";
	        } else {
	            status = stno + " stno not found";
	        }

	    } catch (Exception e) {
	        status = "Update failed";
	        System.out.println(e);
	    }

	    return status;
	}
	
	@Override
	public String deleteStudent(int stno) {

	    String status;

	    try (
	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps = con.prepareStatement(
	            "DELETE FROM student WHERE stno=?"
	        ) ) {

	        ps.setInt(1, stno);
	        int n = ps.executeUpdate();
	        if (n > 0) {
	            status = "Deleted successfully";
	        } else {
	            status = stno + " stno not found";
	        }

	    } catch (Exception e) {
	        status = "Delete failed";
	        System.out.println(e);
	    }

	    return status;
	}
}
