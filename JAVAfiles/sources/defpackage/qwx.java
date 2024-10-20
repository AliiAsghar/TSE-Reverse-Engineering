package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwx implements apxw {
    public static agmh[] a() {
        return (agmh[]) qww.e.c;
    }

    public static agns c() {
        return new agnf(qww.c, "subscriptions", new ptt(13));
    }

    public static agns d() {
        return new agnf(qww.d, true, "subscriptions", new ptt(12));
    }

    public static Executor e(ocz oczVar, armf armfVar, Executor executor) {
        Executor anewVar;
        if (((ansy) ((nlt) oczVar).a.b()).e("bugle.use_two_wide_database_write_executor")) {
            anewVar = (Executor) armfVar.b();
        } else {
            anewVar = new anew(executor);
        }
        anewVar.getClass();
        return anewVar;
    }

    public static Executor f(ocy ocyVar, armf armfVar, Executor executor) {
        if (((ansy) ((nls) ocyVar).a.b()).e("bugle.use_four_wide_executor_for_read")) {
            executor = (Executor) armfVar.b();
        }
        executor.getClass();
        return executor;
    }

    public static agmh[] g() {
        return uvl.p();
    }

    public static agns h() {
        return new agnf(rkq.c, "conversation_participants_backup", new ptt(14));
    }

    public static agns i() {
        return new agnf(rkq.d, true, "conversation_participants_backup", new ptt(15));
    }

    public static agmh[] j() {
        return vom.z();
    }

    public static agns k() {
        return new agnf(rkz.c, "conversation_pins_backup", new ptt(16));
    }

    public static agns l() {
        return new agnf(rkz.d, true, "conversation_pins_backup", new ptt(17));
    }

    public static agmh[] m() {
        return uho.h();
    }

    public static agns n() {
        return new agnf(rlk.c, "conversations_backup", new ptt(18));
    }

    public static agns o() {
        return new agnf(rlk.d, true, "conversations_backup", new ptt(19));
    }

    public static agmh[] p() {
        return ujy.h();
    }

    public static agns q() {
        return new agnf(rlv.c, "link_preview_backup", new ptt(20));
    }

    public static agmh[] r() {
        return umx.l();
    }

    public static agns s() {
        return new agnf(rmh.c, "message_reactions_backup", new rmd(0));
    }

    public static agns t() {
        return new agnf(rmh.d, true, "message_reactions_backup", new rmd(1));
    }

    public static qvv u(qya qyaVar, armf armfVar) {
        armfVar.getClass();
        return qyaVar.d(armfVar);
    }

    public static vid v(Context context, wys wysVar, xnv xnvVar, wzs wzsVar, xbf xbfVar, Object obj, armf armfVar, ryg rygVar, agnq agnqVar, armf armfVar2, armf armfVar3, odn odnVar, armf armfVar4, anen anenVar) {
        return new vid(context, wysVar, xnvVar, wzsVar, xbfVar, (rgf) obj, armfVar, rygVar, agnqVar, armfVar2, armfVar3, odnVar, armfVar4, anenVar);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
