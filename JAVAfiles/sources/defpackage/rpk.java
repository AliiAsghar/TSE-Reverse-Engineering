package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpk {
    public static final rpo a;
    public static final rpo b;
    public static final rpo c;
    public static final rpo d;
    public static final rpo e;
    public static final rpo f;
    public static final rpo g;
    public static final rpo h;
    public static final rpo i;
    public static final rpo j;
    public static final rpo k;

    static {
        String[] strArr = sni.a;
        a = new rpo("conversations");
        String[] strArr2 = MessagesTable.a;
        b = new rpo("messages");
        String[] strArr3 = ParticipantsTable.a;
        c = new rpo("participants");
        String[] strArr4 = qvk.a;
        new rpo("my_identities");
        String[] strArr5 = PartsTable.a;
        d = new rpo("parts");
        String[] strArr6 = sld.a;
        e = new rpo("conversation_participants");
        String[] strArr7 = smp.a;
        f = new rpo("conversation_to_participants");
        String[] strArr8 = sxc.a;
        g = new rpo("message_star");
        String[] strArr9 = slm.a;
        h = new rpo("conversation_pin");
        String[] strArr10 = svq.a;
        i = new rpo("message_reactions");
        String[] strArr11 = svz.a;
        j = new rpo("message_replies");
        String[] strArr12 = sss.a;
        k = new rpo("link_preview");
    }

    public static /* synthetic */ agpj a(agpc agpcVar, agmh agmhVar, agmh agmhVar2, rpo rpoVar, rpo rpoVar2) {
        rpoVar.getClass();
        rpoVar2.getClass();
        sfw sfwVar = new sfw(sfz.a);
        usk uskVar = sfz.d;
        sfwVar.c((sfs) uskVar.e, (sfs) uskVar.b);
        sfwVar.d(new rpf(rpoVar2, 3));
        agpcVar.s();
        sfw sfwVar2 = new sfw(sfz.a);
        sfwVar2.s();
        sfwVar2.d(new rpf(rpoVar, 4));
        agog b2 = agoh.b(sfwVar2.b(), (agmh) sfz.d.e, agmhVar);
        b2.f = "backup_table_join_map";
        agog b3 = agoh.b(agpcVar.j(b2).b(), agmhVar2, (agmh) sfz.d.e);
        b3.f = "backup_id_map";
        return ((sfw) sfwVar.j(b3)).b();
    }
}
