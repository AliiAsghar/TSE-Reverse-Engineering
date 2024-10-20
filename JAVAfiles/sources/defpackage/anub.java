package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anub implements anuf {
    public final aocj a;
    public final anxg b;

    private anub(anxg anxgVar, aocj aocjVar) {
        this.b = anxgVar;
        this.a = aocjVar;
    }

    public static anub a(anxg anxgVar) {
        return new anub(anxgVar, anuk.a(anxgVar.b));
    }

    public static anub b(anxg anxgVar) {
        return new anub(anxgVar, anuk.b(anxgVar.b));
    }
}
