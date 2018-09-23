package com.example.android.miwok;

public class ReportCard {
    private String mName ;
    private String mMathGrade ="a";
    private String mEnglishGrade ;
  //  private String HistoryGrade = "A+";
    int historyGrade =85;

    public ReportCard(String mathGrade,String englishGrade ,String name){
mMathGrade =mathGrade;
mEnglishGrade =englishGrade;
         mName = name;
    }
public String getMathGrade(){
    return mMathGrade;
}

public void setMathGrade(String grade){
    mMathGrade =grade;
}

public String getmEnglishGrade(){
        return mEnglishGrade;
}


public void setmEnglishGrade(String grade){
        mEnglishGrade=grade;
    }
public String getName(){
        return mName;
}
public void setmName(String n){
        mName=n;
}

public String toString(){
    return "Result { " + "Name : "+mName+ "MathGrade = " + mMathGrade +", English = " +mEnglishGrade ;
}

}