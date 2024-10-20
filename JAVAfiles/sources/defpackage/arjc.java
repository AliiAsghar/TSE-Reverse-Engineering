package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjc extends aqzf {
    public static final asqu a = new asqu();
    public final aqux b;
    public final String c;
    public final arhn d;
    public final String e;
    public final arjb f;
    public final boolean g;
    private final arja h;
    private final aqrm i;

    public arjc(aqux aquxVar, aqut aqutVar, arir arirVar, arjh arjhVar, adfg adfgVar, Object obj, int i, int i2, String str, String str2, arhn arhnVar, arhu arhuVar, aqrr aqrrVar) {
        super(new arjo(0), arhnVar, arhuVar, aqutVar, aqrrVar);
        this.h = new arja(this, 0);
        this.g = false;
        this.d = arhnVar;
        this.b = aquxVar;
        this.e = str;
        this.c = str2;
        this.i = arjhVar.n;
        this.f = new arjb(this, i, arhnVar, obj, arirVar, adfgVar, arjhVar, i2);
    }

    @Override // defpackage.araj
    public final aqrm a() {
        return this.i;
    }

    @Override // defpackage.aqzf
    protected final /* synthetic */ aqze p() {
        return this.h;
    }

    @Override // defpackage.aqzf, defpackage.aqzi
    protected final /* synthetic */ aqzh q() {
        return this.f;
    }

    public final aquw r() {
        return this.b.a;
    }

    @Override // defpackage.aqzf
    protected final /* synthetic */ aqzh t() {
        return this.f;
    }
}
