package com.lds.common.resume.parser;

import com.lds.common.resume.BaseTest;
import org.junit.Test;

import java.io.File;

/**
 * @author wx
 * @version 1.0.0
 * @className EducationParserTest
 * @description
 * @date 2019/12/6 15:05
 */
public class ProjectExperienceParserTest extends BaseTest {

    @Test
    public void oneEducationParseZhiLian() throws Exception {
        System.out.println("\n" + "*********************************************************************************************************************************************************************" + "\n");

        File f = new File(basePath + "智联招聘_胡程_软件测试工程师_中文_20191031_1572509741654.doc");
        String html = converHtml(f);

        ProjectExperienceParser parser = new ProjectExperienceParser(html);
        parser.parse().forEach(skills -> {
                    System.out.println(skills.toString());
                }
        );
    }

    @Test
    public void oneEducationParseZhiLian0() throws Exception {
        System.out.println("\n" + "*********************************************************************************************************************************************************************" + "\n");

        File f = new File(basePath + "智联招聘_温琦生_项目运营总监_中文_20191105_1572919559195.doc");
        String html = converHtml(f);

        ProjectExperienceParser parser = new ProjectExperienceParser(html);
        parser.parse().forEach(skills -> {
                    System.out.println(skills.toString());
                }
        );
    }

    @Test
    public void oneEducationParse51Job() throws Exception {
        System.out.println("\n" + "*********************************************************************************************************************************************************************" + "\n");
        File f = new File(basePath + "51job_凌梦之(23234904).doc");
        String html = converHtml(f);

        ProjectExperienceParser parser = new ProjectExperienceParser(html);
        parser.parse().forEach(skills -> {
                    System.out.println(skills.toString());
                }
        );
    }

    @Test
    public void oneEducationParse51Job0() throws Exception {
        System.out.println("\n" + "*********************************************************************************************************************************************************************" + "\n");
        File f = new File(basePath + "51job_简兆坚(57768818).doc");
        String html = converHtml(f);

        ProjectExperienceParser parser = new ProjectExperienceParser(html);
        parser.parse().forEach(skills -> {
                    System.out.println(skills.toString());
                }
        );
    }
}