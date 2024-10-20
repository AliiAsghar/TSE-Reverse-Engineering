package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzd extends arpw implements arqw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(aair aairVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = aairVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.d != 0) {
            zzd zzdVar = new zzd((zap) this.c, (arpe) obj3, 1);
            zzdVar.a = (miu) obj;
            zzdVar.b = (alog) obj2;
            return zzdVar.b(arnb.a);
        }
        zzd zzdVar2 = new zzd((aair) this.c, (arpe) obj3, 0);
        zzdVar2.a = (miu) obj;
        zzdVar2.b = (alog) obj2;
        return zzdVar2.b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        if (((defpackage.xbf) ((defpackage.zap) r12.c).f).e(((com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r0.get(0)).f().G(true).a) != false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [miu, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzd.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zap zapVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = zapVar;
    }
}
