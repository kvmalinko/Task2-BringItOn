package test;

import org.testng.annotations.Test;

public class NewPasteTest extends PreconditionTest {

    @Test
    public void checkPageTitleAndPasteName()
    {
        String textPasteField = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String textPasteName = "how to gain dominance among developers";
        String textSyntaxHighlighting = "Bash";
        mainPage.openPage();
        mainPage.pasteTextIntoNewPasteField(textPasteField);
        mainPage.selectSyntaxHighlighting("Bash");
        mainPage.selectPasteExpiration();
        mainPage.pasteTextIntoPasteNameField(textPasteName);
        mainPage.clickCreateNewPasteButton();
        mainPage.checkPasteName(textPasteName);
        mainPage.checkTextSyntaxButton(textSyntaxHighlighting);
        mainPage.checkTextPasteField(textPasteField);
    }

//    @Test
  //  public void checkSyntaxHighlightedForBash()
    //{
      //  String textPasteField = "git config --global user.name  \"New Sheriff in Town\"\n" +
        //        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
          //      "git push origin master --force";
 //       String textPasteName = "how to gain dominance among developers";
   //     String textSyntaxHighlighting = "Bash";
     //   mainPage.openPage();
       // mainPage.pasteTextIntoNewPasteField(textPasteField);
      //  mainPage.selectSyntaxHighlighting(textSyntaxHighlighting);
        //mainPage.selectPasteExpiration();
        //mainPage.pasteTextIntoPasteNameField(textPasteName);
        //mainPage.clickCreateNewPasteButton();
        //mainPage.checkTextSyntaxButton(textSyntaxHighlighting);
    //}

    //@Test
   // public void checkRavPasteDataTextMatchNewPasteText()
   // {
   //     String textPasteField = "git config --global user.name  \"New Sheriff in Town\"\n" +
    //            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
  //              "git push origin master --force";
  //      String textPasteName = "how to gain dominance among developers";
    //    String textSyntaxHighlighting = "Bash";
      //  mainPage.openPage();
        //mainPage.pasteTextIntoNewPasteField(textPasteField);
       // mainPage.selectSyntaxHighlighting(textSyntaxHighlighting);
      //  mainPage.selectPasteExpiration();
      //  mainPage.pasteTextIntoPasteNameField(textPasteName);
      //  mainPage.clickCreateNewPasteButton();
      //  mainPage.checkTextPasteField(textPasteField);
    //}
}
