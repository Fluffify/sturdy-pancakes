
import javax.swing.*;

public class Main 
{
    
    public static void main(String[]args) throws Exception
    {
        Model model = new Model();
        View view = new View(model);
        LoginController loginController = new LoginController(model, view);
        MainMenuController mainController = new MainMenuController(model, view);
        GeneratorController generatorController = new GeneratorController(model,view);
        RegisterController registerController = new RegisterController(model,view);
        CreateCategoryController createCategoryController = new CreateCategoryController(model, view);
        CreateCredentialsController createCredentialsController = new CreateCredentialsController(model, view);
        EditCategoryController editCategoryController = new EditCategoryController(model, view);
        DeleteCategoryController deleteCategoryController = new DeleteCategoryController(model, view);
        DeleteCredentialController deleteCredentialController = new DeleteCredentialController(model, view);
        ViewPortfolioController viewPortfolioController = new ViewPortfolioController(model, view);
    }
}
