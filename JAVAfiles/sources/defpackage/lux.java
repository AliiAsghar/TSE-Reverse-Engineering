package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lux extends arpw implements arqv {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lux(long j, arpe arpeVar) {
        super(2, arpeVar);
        this.a = j;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lux) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        tiw tiwVar = new tiw();
        tiz tizVar = tiz.b;
        if (tizVar == null) {
            tiwVar.a.putNull("status");
        } else {
            tiwVar.a.put("status", Integer.valueOf(tizVar.ordinal()));
        }
        long j = this.a;
        tix tixVar = new tix();
        tixVar.U(new agoi("restore_workflow_files._id", 1, Long.valueOf(j)));
        return Boolean.valueOf(tiwVar.ae(new agpw(tixVar), "restore_workflow_files-buildAndUpdateForId"));
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new lux(this.a, arpeVar);
    }
}
