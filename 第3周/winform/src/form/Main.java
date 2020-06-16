package form;

public class Main {
    public static void main(String[] args) {

        WindowForm windowForm = new WindowForm("WINDOWS窗口");

        Picture picture = new Picture("LOGO图片");
        windowForm.addChild(picture);

        Button login = new Button("登录");
        Button register = new Button("注册");

        windowForm.addChild(login);
        windowForm.addChild(register);

        Frame frame = new Frame("FRAME1");

        Label userLabel = new Label("用户名");
        frame.addChild(userLabel);
        TextBox userText = new TextBox("文本框");
        frame.addChild(userText);

        Label passwordLabel = new Label("密码");
        frame.addChild(passwordLabel);
        PasswordBox passwordBox = new PasswordBox("密码框");
        frame.addChild(passwordBox);

        CheckBox checkBox = new CheckBox("复选框");
        TextBox remPassword = new TextBox("记住用户名");
        LinkLabel linkLabel = new LinkLabel("忘记密码");
        frame.addChild(checkBox);
        frame.addChild(remPassword);
        frame.addChild(linkLabel);

        windowForm.addChild(frame);

        UIContext  context =  UIContext.withContext(null, windowForm);

        windowForm.draw(context);
    }
}
