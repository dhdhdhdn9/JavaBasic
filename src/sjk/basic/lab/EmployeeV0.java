package sjk.basic.lab;

import java.time.LocalDate;

class EmployeeV0 {

    protected String empno;
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected LocalDate hdate;
    protected String jobid;
    protected int sal;
    protected double comm;
    protected String mgrid;
    protected String detpid;

    public EmployeeV0(String fname, String lname,
                      String email, String phone, LocalDate hdate) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }

    public String getEmpno() { return empno; }

    public void setEmpno(String empno) { this.empno = empno; }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getHdate() {
        return hdate;
    }

    public void setHdate(LocalDate hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public String getMgrid() {
        return mgrid;
    }

    public void setMgrid(String mgrid) {
        this.mgrid = mgrid;
    }

    public String getDetpid() {
        return detpid;
    }

    public void setDetpid(String detpid) {
        this.detpid = detpid;
    }


    @Override
    public String toString() {
        String fmt = "emp{empno: %s, fname: %s, lname: %s, email: %s, phone: %s, \n" +
                "hdate: %s, jobid: %s, sal: %d만, comm: %.1f, mgrid: %s, deptid: %s} \n";
        String result = String.format(fmt, empno, fname, lname, email,
                phone, hdate, jobid, sal, comm, mgrid, detpid);
        return result;
    }
}
