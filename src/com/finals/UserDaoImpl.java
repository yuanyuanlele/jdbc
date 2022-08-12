package com.finals;

import com.finals.utils.Dbutils;
import com.mysql.cj.QueryResult;
import org.apache.commons.dbutils.QueryRunner;

public class UserDaoImpl {
    private QueryRunner queryRunner=new QueryRunner(Dbutils.getDruidDataSource());

}
