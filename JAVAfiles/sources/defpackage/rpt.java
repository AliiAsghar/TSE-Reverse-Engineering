package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpt {
    public static final armf a = new msl(3);
    public static final armf b = new msl(4);

    public static final rko a() {
        rko a2 = rkq.a();
        a2.s();
        a2.n(new agpk("$V", new Object[]{rkq.e.c}), "backup_id");
        a2.n(new agpk("$V", new Object[]{-1}), "bugle_id");
        sfw sfwVar = new sfw(sfz.a);
        sfwVar.s();
        sfwVar.d(new rqa(1));
        return (rko) a2.j(agoh.b(sfwVar.b(), (agmh) sfz.d.e, (agmh) rkq.e.d));
    }

    public static final agog b() {
        return vom.w((agmh) rkq.e.d, rpk.a, "convo_id_map", false, 16);
    }

    public static final agog c() {
        return vom.w((agmh) rkq.e.e, rpk.c, "participant_id_map", false, 16);
    }
}
