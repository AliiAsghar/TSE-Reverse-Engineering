package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mam extends agmc {
    final /* synthetic */ man a;

    public mam(man manVar) {
        this.a = manVar;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        String str;
        MessagesTable.BindData bindData = (MessagesTable.BindData) agloVar.p();
        if (bindData != null) {
            man manVar = this.a;
            MessageIdType A = bindData.A();
            if (A != null) {
                Object am = bindData.am(amgj.class.getName());
                if (am instanceof amgj) {
                    str = Integer.toString(((amgj) am).w);
                } else {
                    str = null;
                }
                if (bindData.am("mismatchedThreadId") instanceof Boolean) {
                    if (str != null) {
                        str = str.concat(" ");
                    }
                    str = String.valueOf(str).concat(String.valueOf(mem.THREAD_ID_MISMATCH.d));
                }
                manVar.e(A, bindData.q(), Optional.ofNullable(str));
                return;
            }
            return;
        }
        sxz sxzVar = (sxz) agloVar.r();
        int i = 0;
        if (sxzVar != null) {
            sxzVar.k(new mai(this.a, sxzVar, i));
        }
        syb sybVar = (syb) agloVar.s();
        if (sybVar != null) {
            sybVar.d(new maj(this.a, i));
        }
    }
}
