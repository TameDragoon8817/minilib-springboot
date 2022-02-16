package com.mavenbase.minilibspringboot.pojo;

public class BookType {
    private String codeId;
    private String codeName;

    @Override
    public String toString() {
        return "BookType{" +
                "codeId='" + codeId + '\'' +
                ", codeName='" + codeName + '\'' +
                '}';
    }

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
}
