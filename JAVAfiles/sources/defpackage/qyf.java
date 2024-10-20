package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyf implements ufz {
    public final String a;
    public final armf b;
    private final qyg c;
    private final armf d;
    private final armf e;

    public qyf(qyg qygVar, String str, armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = qygVar;
        this.a = str;
        this.d = armfVar;
        this.b = armfVar2;
        this.e = armfVar3;
    }

    @Override // defpackage.ufz
    public final void fC(ufw ufwVar) {
        alwl alwlVar = (alwl) qyg.a.i();
        alwlVar.X(ugl.g, ufwVar.m());
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/ProfilePhotoBasedParticipantColorUpdater$ImageRequestListener", "onMediaResourceLoadError", 104, "ProfilePhotoBasedParticipantColorUpdater.java")).q("Unable to load resource");
        this.c.a(this.a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // defpackage.ufz
    public final /* synthetic */ void fD(defpackage.ufw r28, defpackage.ugg r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyf.fD(ufw, ugg, boolean):void");
    }
}
