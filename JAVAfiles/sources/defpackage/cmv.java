package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmv {
    public static final tx a;

    static {
        float[] fArr = cms.a;
        cnn cnnVar = cms.e;
        int i = cnnVar.c;
        cmt cmtVar = new cmt(cnnVar);
        cnn cnnVar2 = cms.e;
        int i2 = cnnVar2.c;
        cmk cmkVar = cms.x;
        int i3 = i2 | (cmkVar.c << 6);
        cmu cmuVar = new cmu(cnnVar2, cmkVar, 0);
        cmk cmkVar2 = cms.x;
        int i4 = cmkVar2.c;
        cnn cnnVar3 = cms.e;
        int i5 = i4 | (cnnVar3.c << 6);
        cmu cmuVar2 = new cmu(cmkVar2, cnnVar3, 0);
        tx txVar = new tx((byte[]) null);
        txVar.f(i | (i << 6), cmtVar);
        txVar.f(i3, cmuVar);
        txVar.f(i5, cmuVar2);
        a = txVar;
    }
}
