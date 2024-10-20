package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiix extends aijc {
    public final int a;
    public final String b;

    public aiix(String str, int i, String str2) {
        super(str);
        this.a = i;
        this.b = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aiix a(aijc aijcVar, int i, String str) {
        String f = aijcVar.f();
        String d = aijcVar.d();
        if (f != null && d != null) {
            aiix aiixVar = new aiix(aijcVar.d, i, str);
            aiixVar.g("To-Path", d);
            aiixVar.g("From-Path", f);
            return aiixVar;
        }
        throw new aiip("Can't build a response for a message without to & from headers");
    }
}
