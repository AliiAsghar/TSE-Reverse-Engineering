package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcn extends arrp implements arqg<arnb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ iba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcn(boolean z, iba ibaVar, String str) {
        super(0);
        this.a = z;
        this.c = ibaVar;
        this.b = str;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.a) {
            iba ibaVar = this.c;
            String str = this.b;
            Object obj = ibaVar.b;
            synchronized (((gka) obj).g) {
            }
        }
        return arnb.a;
    }
}
