package skimp.store.lib.storelibsample;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * 로딩 프로그레스 출력
 */

public class DialogUtil {
    private static ProgressDialog progressDialog;

    //
    public static void show(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("인증중...");
        progressDialog.show();
    }

    // 사용자 지정 키로 AES256 복호화
    public static void dismiss() {
        progressDialog.dismiss();
    }

}