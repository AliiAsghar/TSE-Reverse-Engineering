package defpackage;

import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajsw extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        GroupMember groupMember = (GroupMember) obj;
        aozy createBuilder = wbz.a.createBuilder();
        String d = groupMember.d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbz wbzVar = (wbz) createBuilder.b;
        wbzVar.b |= 1;
        wbzVar.c = d;
        wcz wczVar = (wcz) ajtp.b.m().fu(groupMember.b());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbz wbzVar2 = (wbz) createBuilder.b;
        wczVar.getClass();
        wbzVar2.d = wczVar;
        wbzVar2.b |= 2;
        if (groupMember.c().isPresent() && groupMember.c().isPresent()) {
            wcz wczVar2 = (wcz) ajtp.b.m().fu(groupMember.c().get());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbz wbzVar3 = (wbz) createBuilder.b;
            wczVar2.getClass();
            wbzVar3.e = wczVar2;
            wbzVar3.b |= 4;
        }
        boolean e = groupMember.e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbz wbzVar4 = (wbz) createBuilder.b;
        wbzVar4.b |= 8;
        wbzVar4.f = e;
        wby wbyVar = (wby) ajtp.a.m().fu(groupMember.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbz wbzVar5 = (wbz) createBuilder.b;
        wbzVar5.g = wbyVar.e;
        wbzVar5.b |= 16;
        return (wbz) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wbz wbzVar = (wbz) obj;
        ajqh f = GroupMember.f();
        if ((wbzVar.b & 1) != 0) {
            f.b(wbzVar.c);
        }
        if ((wbzVar.b & 2) != 0) {
            algf algfVar = ajtp.b;
            wcz wczVar = wbzVar.d;
            if (wczVar == null) {
                wczVar = wcz.a;
            }
            f.c((RcsDestinationId) algfVar.fu(wczVar));
        }
        if ((wbzVar.b & 4) != 0) {
            algf algfVar2 = ajtp.b;
            wcz wczVar2 = wbzVar.e;
            if (wczVar2 == null) {
                wczVar2 = wcz.a;
            }
            f.b = Optional.of((RcsDestinationId) algfVar2.fu(wczVar2));
        }
        if ((wbzVar.b & 8) != 0) {
            f.d(wbzVar.f);
        }
        if ((wbzVar.b & 16) != 0) {
            algf algfVar3 = ajtp.a;
            wby b = wby.b(wbzVar.g);
            if (b == null) {
                b = wby.UNKNOWN_TYPE;
            }
            f.f((ajqi) algfVar3.fu(b));
        }
        return f.a();
    }
}
