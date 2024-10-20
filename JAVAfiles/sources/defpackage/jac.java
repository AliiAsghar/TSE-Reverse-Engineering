package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jac extends ijy<jbf> {
    final /* synthetic */ jad a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jac(jad jadVar) {
        super("multisim dialog data");
        this.a = jadVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        jbf jbfVar = (jbf) obj;
        jbfVar.getClass();
        jad jadVar = this.a;
        jadVar.f = true;
        if (jadVar.g) {
            if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                alvw g = jad.a.g();
                g.X(alwp.a, "BugleConversation");
                ((alvg) g.h("com/google/android/apps/messaging/conversation/simpicker/ActiveSimChecker$subscriptionCallback$1", "onNewData", 73, "ActiveSimChecker.kt")).q("Skipping multi sim dialog data result after activity recreation");
            }
            this.a.g = false;
            return;
        }
        if (jbfVar instanceof jbc) {
            if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                alvw g2 = jad.a.g();
                g2.X(alwp.a, "BugleConversation");
                jbc jbcVar = (jbc) jbfVar;
                ((alvg) g2.h("com/google/android/apps/messaging/conversation/simpicker/ActiveSimChecker$subscriptionCallback$1", "onNewData", 83, "ActiveSimChecker.kt")).B("Automatically switching SIM to selfParticipant: %s, subscription: %s", jbcVar.a, jbcVar.b);
            }
            ((mbl) this.a.c.b()).c("Bugle.Sim.ActiveSimChecker.AutoSwitched");
            ((abay) this.a.d.b()).a(R.string.active_sim_switched_toast, true);
            jad jadVar2 = this.a;
            jbc jbcVar2 = (jbc) jbfVar;
            jadVar2.e.a(jbcVar2.a, Integer.valueOf(jbcVar2.b));
            return;
        }
        if (jbfVar instanceof jbd) {
            if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                alvw g3 = jad.a.g();
                g3.X(alwp.a, "BugleConversation");
                ((alvg) g3.h("com/google/android/apps/messaging/conversation/simpicker/ActiveSimChecker$subscriptionCallback$1", "onNewData", 97, "ActiveSimChecker.kt")).r("Displaying SIM picker dialog with %d subscriptions", ((jbd) jbfVar).a.size());
            }
            ((mbl) this.a.c.b()).c("Bugle.Sim.ActiveSimChecker.Dialog.Shown");
            jad jadVar3 = this.a;
            List list = ((jbd) jbfVar).a;
            ipk ipkVar = new ipk(jadVar3, 3);
            gpx gpxVar = jadVar3.i;
            iji ijiVar = (iji) gpxVar.a.b();
            Context context = (Context) gpxVar.c.b();
            aksr aksrVar = (aksr) gpxVar.d.b();
            aksrVar.getClass();
            jat jatVar = new jat(ijiVar, context, aksrVar, (ahmn) gpxVar.b.b(), list, ipkVar);
            Object obj2 = jatVar.a;
            ArrayAdapter arrayAdapter = (ArrayAdapter) jatVar.g;
            akui akuiVar = new akui((ahmn) obj2, arrayAdapter.getContext(), arrayAdapter);
            ajgi ajgiVar = new ajgi((Context) jatVar.d);
            ajgiVar.y(((Context) jatVar.d).getString(R.string.sim_dialog_picker_title));
            ajgiVar.v(akuiVar, ((jam) jatVar.g).a, new aabt(jatVar.c, "SimPickerDialog: Selected Sim", new ise(jatVar, akuiVar, 3, null), 8));
            ajgiVar.j(false);
            ajgiVar.u(((Context) jatVar.d).getString(R.string.sim_dialog_positive_button), new aabt(jatVar.c, "SimPickerDialog: Switched To Selected Sim", new ivs(jatVar, 3), 8));
            ajgiVar.a();
            return;
        }
        if (d.F(jbfVar, jbe.a)) {
        } else {
            throw new armm();
        }
    }
}
