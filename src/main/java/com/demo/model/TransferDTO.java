package com.demo.model;

import com.deepl.api.DeepLException;
import com.deepl.api.TextResult;
import com.deepl.api.Translator;

/**
 * @Author huangfeng
 * @Date 2023/10/30 15:23
 * @description
 * @Version 1.0
 */
public class TransferDTO implements Runnable{
    public TransferDTO(String text) {
        this.text = text;
    }

    private String text;
    @Override
    public void run() {
      translator(text);
    }

    public  String translator(String text) {

      /*  try {
            String url = "https://api-free.deepl.com/v2/translate";
            String authKey = "f3bf4882-58ac-50e1-5d7e-a5af8deee4b5:fx";  // Replace with your key
            String targetLang = "ZH";
            String source = "Releasing new market report later today on Arete Research. Covering what I'm seeing from structural flows perspective, risks to upside and catalysts with executable triggers I've been watching closely.";
            Map<String, Object> map = new HashMap<>(2);
            map.put("text", Arrays.asList(source));
            map.put("target_lang", targetLang);
            return HttpRequest.post(url).form(map)
                    .header("Authorization", String.format("DeepL-Auth-Key [%s]", authKey))
                    .header("Content-Type", "application/json").execute().body();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";*/


        String authKey = "f3bf4882-58ac-50e1-5d7e-a5af8deee4b5:fx";  // Replace with your key
        Translator translator = new Translator(authKey);
        TextResult result = null;
        try {
            result = translator.translateText(text, null, "ZH");
        } catch (DeepLException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result.getText()); // "Bonjour, le monde !"
        return result.getText();
    }
}
