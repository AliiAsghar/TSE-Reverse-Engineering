package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmo implements lkf {
    public final String a;
    public final uvn b;

    public lmo() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public /* synthetic */ lmo(String str, uvn uvnVar, int i) {
        str = 1 == (i & 1) ? "Messenger_conversation" : str;
        str.getClass();
        this.a = str;
        this.b = (i & 2) != 0 ? null : uvnVar;
    }
}
