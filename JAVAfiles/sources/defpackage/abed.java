package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abed extends unp {
    public static final alwo a = alwo.o("BugleWearable");
    public final armf b;
    public final armf c;
    public final armf d;
    private final arwe e;
    private final armf f;
    private final armf g;

    public abed(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.e = arweVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.d = armfVar5;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("LoadPagedConversationTimeoutFallbackHandler");
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        abdw abdwVar = (abdw) apbtVar;
        abdwVar.getClass();
        ((mbl) ((zfh) this.d.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.TimeoutFallback.Started");
        c = qjh.c(this.e, arpj.a, arwf.a, new qnm(this, abdwVar, (arpe) null, 4));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = abdw.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.unp, defpackage.unx
    public final /* bridge */ /* synthetic */ boolean h(apbt apbtVar) {
        abdw abdwVar = (abdw) apbtVar;
        abdwVar.getClass();
        if (!((ywi) this.f.b()).a().booleanValue()) {
            return false;
        }
        if (!((aagg) this.g.b()).c()) {
            alvw n = a.n();
            n.X(ydl.M, "LoadPagedConversationTimeoutFallbackHandler");
            n.q("Skip sending paged conversation data to wear device.");
            return false;
        }
        String str = abdwVar.c;
        str.getClass();
        if (str.length() != 0) {
            return true;
        }
        alvw n2 = a.n();
        n2.X(ydl.M, "LoadPagedConversationTimeoutFallbackHandler");
        n2.q("Connected watch node Id is empty. Skip sending paged conversation data to wear device.");
        return false;
    }
}
