package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aodl extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public aodl() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aodl(String str) {
        super(str);
        abhg.l(str, "Detail message must not be empty");
    }
}
