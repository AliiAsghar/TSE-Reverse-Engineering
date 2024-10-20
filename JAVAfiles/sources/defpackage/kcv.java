package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcv extends arpw implements arqv {
    /* synthetic */ Object a;
    final /* synthetic */ lrc b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcv(lrc lrcVar, boolean z, arpe arpeVar) {
        super(2, arpeVar);
        this.b = lrcVar;
        this.c = z;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kcv) c((miz) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        miz mizVar = (miz) this.a;
        if (mizVar == null) {
            ((alvg) kcy.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl$onClick$1$1$job$1$1", "invokeSuspend", 94, "MetatextClickHandlerImpl.kt")).q("Message is deleted, hiding bottom sheet");
            this.b.a();
            return false;
        }
        if (!this.c && lga.ca(mizVar)) {
            ((alvg) kcy.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl$onClick$1$1$job$1$1", "invokeSuspend", 100, "MetatextClickHandlerImpl.kt")).q("Message is sent, hiding bottom sheet");
            this.b.a();
            return false;
        }
        return true;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        kcv kcvVar = new kcv(this.b, this.c, arpeVar);
        kcvVar.a = obj;
        return kcvVar;
    }
}
