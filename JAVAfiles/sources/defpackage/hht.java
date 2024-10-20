package defpackage;

import android.view.View;
import java.security.Key;
import java.security.spec.KeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hht {
    public static /* synthetic */ String a(hhs hhsVar, String str) {
        return str + d.C(hhsVar.p()) + " at path " + hhsVar.d();
    }

    public static /* synthetic */ String b(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String c(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String d(Object obj, Class cls, String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String e(cg cgVar, Class cls) {
        return "Attempt to inject a Fragment wrapper of type " + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(cgVar.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ String f(View view) {
        return "TikTok View " + view.getClass().toString() + ", cannot be attached to a non-TikTok Fragment";
    }

    public static /* synthetic */ String h(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String i(anxp anxpVar, String str) {
        return str + anxpVar.a();
    }

    public static /* synthetic */ String j(String str, aoro aoroVar, String str2, String str3) {
        return str2 + str + str3 + aoroVar.f();
    }

    public static /* synthetic */ String k(KeySpec keySpec, String str) {
        return str + String.valueOf(keySpec.getClass()) + ".";
    }

    public static /* synthetic */ String l(Key key, String str) {
        return str + String.valueOf(key.getClass()) + ".";
    }
}
