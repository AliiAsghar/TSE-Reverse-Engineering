package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifa extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifa(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        akul c;
        int i;
        int dimension;
        int i2 = 8;
        int i3 = 0;
        enb enbVar = null;
        String str = null;
        switch (this.b) {
            case 0:
                return dyt.d(this.a).aL();
            case 1:
                return ((gqu) this.a).a;
            case 2:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null) {
                    return enbVar.Q();
                }
                return epb.a;
            case 3:
                return ((aov) this.a).d().i();
            case 4:
                this.a.a();
                return arnb.a;
            case 5:
                this.a.a();
                return arnb.a;
            case 6:
                this.a.a();
                return arnb.a;
            case 7:
                this.a.a();
                return arnb.a;
            case 8:
                ikr ikrVar = (ikr) this.a;
                c = qjh.c(ikrVar.a, arpj.a, arwf.a, new ikp(ikrVar, (arpe) null, 2, (byte[]) null));
                ikrVar.g.q(c, ikrVar.c);
                return arnb.a;
            case 9:
                ifb ifbVar = (ifb) this.a.b();
                Object obj = ifbVar.a;
                taz e = ParticipantsTable.e();
                e.w("SelfParticipantsDataServiceFactory");
                e.g(new idc(16));
                return ((iew) obj).c("self_participant", e.b(), new eig(ifbVar, (arpe) null, 14));
            case 10:
                if (!((Boolean) ipe.a.e()).booleanValue()) {
                    return null;
                }
                ipc ipcVar = (ipc) this.a;
                ifb ifbVar2 = ipcVar.p;
                ifb ifbVar3 = (ifb) ifbVar2.a.b();
                ifbVar3.getClass();
                return new ipu(ifbVar3, (ifb) ifbVar2.b.b(), ipcVar.h, 1);
            case 11:
                if (!((Boolean) ipe.g.e()).booleanValue()) {
                    return null;
                }
                ipc ipcVar2 = (ipc) this.a;
                gqg gqgVar = ipcVar2.m;
                Activity activity = (Activity) gqgVar.b.b();
                ifb ifbVar4 = (ifb) gqgVar.e.b();
                ifbVar4.getClass();
                return new ipi(activity, ifbVar4, (kor) gqgVar.a.b(), (mci) gqgVar.d.b(), (kor) gqgVar.c.b(), ipcVar2.h);
            case 12:
                return ((ipc) this.a).h();
            case 13:
                afkq afkqVar = ((ipc) this.a).j;
                if (afkqVar == null) {
                    arro.b("draftController");
                    return null;
                }
                return afkqVar;
            case 14:
                if (!((Boolean) ipe.b.e()).booleanValue()) {
                    return null;
                }
                ipc ipcVar3 = (ipc) this.a;
                ifb ifbVar5 = ipcVar3.o;
                ifb ifbVar6 = (ifb) ifbVar5.a.b();
                ifbVar6.getClass();
                return new ipu(ifbVar6, (ifb) ifbVar5.b.b(), ipcVar3.h, 0);
            case 15:
                if (!((Boolean) ipe.g.e()).booleanValue()) {
                    return null;
                }
                ipc ipcVar4 = (ipc) this.a;
                jat jatVar = ipcVar4.n;
                cg cgVar = (cg) ((apxx) jatVar.e).a;
                Context context = (Context) jatVar.g.b();
                context.getClass();
                ifb ifbVar7 = (ifb) jatVar.d.b();
                ifbVar7.getClass();
                kor korVar = (kor) jatVar.a.b();
                kor korVar2 = (kor) jatVar.c.b();
                korVar2.getClass();
                return new ipx(cgVar, context, ifbVar7, korVar, korVar2, (mci) jatVar.b.b(), (kor) jatVar.f.b(), ipcVar4.h);
            case 16:
                aozy createBuilder = amqj.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.a;
                apag apagVar = createBuilder.b;
                amqj amqjVar = (amqj) apagVar;
                amqjVar.c = ((iqj) obj2).c.v;
                amqjVar.b |= 1;
                amqi amqiVar = amqi.EXPANDED;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                amqj amqjVar2 = (amqj) createBuilder.b;
                amqjVar2.d = amqiVar.e;
                amqjVar2.b |= 2;
                return (amqj) createBuilder.s();
            case 17:
                ((iyc) this.a).b.setAlpha(brg.a);
                ((iyc) this.a).b.setVisibility(0);
                ixy c2 = ((iyc) this.a).c();
                if (true != d.F(c2, ixx.a)) {
                    i2 = 0;
                }
                iyc iycVar = (iyc) this.a;
                iycVar.d.setVisibility(i2);
                if (!(c2 instanceof ixx)) {
                    if (c2 instanceof ixw) {
                        str = iycVar.d((ixw) c2);
                    } else {
                        throw new armm();
                    }
                }
                iycVar.d.setText(str);
                iyc iycVar2 = (iyc) this.a;
                ViewGroup viewGroup = iycVar2.c;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                ixy c3 = iycVar2.c();
                if (c3 instanceof ixx) {
                    i = ((Number) iycVar2.e.a()).intValue();
                } else if (c3 instanceof ixw) {
                    i = -2;
                } else {
                    throw new armm();
                }
                layoutParams.width = i;
                layoutParams.height = iycVar2.b.getResources().getDimensionPixelSize(iycVar2.c().a());
                int max = Math.max(0, (((Number) iycVar2.f.a()).intValue() - layoutParams.width) / 2);
                int max2 = Math.max(0, (((Number) iycVar2.g.a()).intValue() - layoutParams.height) / 2);
                iycVar2.b.setPadding(max, max2, max, max2);
                viewGroup.setLayoutParams(layoutParams);
                iyc iycVar3 = (iyc) this.a;
                ixy c4 = iycVar3.c();
                if (c4 instanceof ixx) {
                    dimension = 0;
                } else if (c4 instanceof ixw) {
                    dimension = (int) iycVar3.b.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_start_padding);
                } else {
                    throw new armm();
                }
                ixy c5 = iycVar3.c();
                if (!(c5 instanceof ixx)) {
                    if (c5 instanceof ixw) {
                        i3 = (int) iycVar3.b.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_end_padding);
                    } else {
                        throw new armm();
                    }
                }
                ViewGroup viewGroup2 = iycVar3.c;
                viewGroup2.setPadding(dimension, viewGroup2.getPaddingTop(), i3, viewGroup2.getPaddingBottom());
                ((iyc) this.a).f();
                return arnb.a;
            case 18:
                ((iyc) this.a).b.setAlpha(1.0f);
                return arnb.a;
            case 19:
                ((iyc) this.a).b.setAlpha(1.0f);
                ((iyc) this.a).b.setVisibility(0);
                return arnb.a;
            default:
                ((iyc) this.a).b.setAlpha(brg.a);
                ((iyc) this.a).b.setVisibility(8);
                return arnb.a;
        }
    }
}
