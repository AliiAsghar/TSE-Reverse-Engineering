package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mai implements agpv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ agpr b;
    private final /* synthetic */ int c;

    public /* synthetic */ mai(Object obj, agpr agprVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = agprVar;
    }

    @Override // defpackage.agpv
    public final boolean a(agpy agpyVar) {
        mej mejVar;
        if (this.c != 0) {
            if (!(agpyVar instanceof agmd)) {
                return false;
            }
            agmd agmdVar = (agmd) agpyVar;
            if (!agkx.ab(agmdVar.d, sni.c.a.toString()) || agmdVar.b != 1) {
                return false;
            }
            agpr agprVar = this.b;
            if (agprVar.l("archive_status")) {
                if (tqc.a(agprVar.a.getAsInteger("archive_status").intValue()).d()) {
                    mejVar = mej.CONVERSATION_ARCHIVED_EVENT;
                } else {
                    mejVar = mej.CONVERSATION_UNARCHIVED_EVENT;
                }
                ((mac) this.a).e(mejVar, Optional.of(agmdVar.a));
            }
            return true;
        }
        if (agpyVar instanceof agmd) {
            agmd agmdVar2 = (agmd) agpyVar;
            if (agkx.ab(agmdVar2.d, MessagesTable.c.a.toString()) && agmdVar2.b == 1) {
                agpr agprVar2 = this.b;
                ((man) this.a).e(rvc.b(agmdVar2.a), ((sxz) agprVar2).a(), Optional.empty());
                return true;
            }
        }
        return false;
    }
}
