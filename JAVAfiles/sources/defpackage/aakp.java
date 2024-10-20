package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.Telephony;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aakp implements aalq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aakp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, ify] */
    /* JADX WARN: Type inference failed for: r12v35, types: [yxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37, types: [lqe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.aalq
    public final void a(zof zofVar) {
        int i = 2;
        switch (this.b) {
            case 0:
                int i2 = 9;
                zms zmsVar = new zms(i2);
                Object obj = this.a;
                ((aalt) obj).ax.j(zmsVar).k(qiu.c(new aakw(obj, i2)), andi.a);
                return;
            case 1:
                aalt aaltVar = (aalt) this.a;
                Optional optional = (Optional) ((apxx) aaltVar.aB).a;
                if (optional.isPresent()) {
                    ((lqb) optional.get()).a();
                    return;
                } else {
                    ((abbu) aaltVar.Z.b()).l("Birthday Sync is not available in this build");
                    return;
                }
            case 2:
                ((Optional) ((aalt) this.a).ay.b()).ifPresent(new aabj(15));
                return;
            case 3:
                AlertDialog.Builder builder = new AlertDialog.Builder((Context) zofVar.b);
                aalt aaltVar2 = (aalt) this.a;
                ListenableFuture l = ((atsg) aaltVar2.aD.b()).l(Telephony.MmsSms.CONTENT_URI, new Bundle());
                aktp.ap(l).h(new aakf(l, builder, i), aaltVar2.ai).h(new zet(builder, 17), aaltVar2.I);
                return;
            case 4:
                boolean booleanValue = ((Boolean) yck.b.e()).booleanValue();
                Object obj2 = zofVar.b;
                Object obj3 = this.a;
                if (booleanValue) {
                    ((aalt) obj3).n((Activity) obj2, "enableGoForegroundImmediately", Boolean.toString(!((yck) r4.V.b()).h), new aaki(obj3, obj2, 10), null, null);
                    return;
                } else {
                    ((yck) ((aalt) obj3).V.b()).o();
                    aalt.q((Activity) obj2);
                    return;
                }
            case 5:
                new aaln((aalt) this.a, (Activity) zofVar.b).e(new Void[0]);
                return;
            case 6:
                ((aalt) this.a).v(2, 1, 1, 1);
                return;
            case 7:
                ((aalt) this.a).v(2, 2, 1, 1);
                return;
            case 8:
                ((aalt) this.a).v(2, 1, 2, 1);
                return;
            case 9:
                Context context = (Context) zofVar.b;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
                ScrollView scrollView = new ScrollView(context);
                LinearLayout linearLayout = new LinearLayout(context);
                scrollView.addView(linearLayout);
                scrollView.setFillViewport(true);
                linearLayout.setOrientation(1);
                builder2.setView(scrollView);
                linearLayout.addView(zofVar.c("Comma separated spammy phone numbers"));
                EditText b = zofVar.b(1);
                b.setHint("+14445556666,+12223334444");
                Object obj4 = this.a;
                alog n = alog.n(((znj) ((aalt) obj4).H.b()).a);
                if (!n.isEmpty()) {
                    b.setText(TextUtils.join(",", n));
                }
                linearLayout.addView(b);
                builder2.setPositiveButton("Create", (DialogInterface.OnClickListener) null);
                builder2.setNegativeButton("Close", new aala(1));
                AlertDialog create = builder2.create();
                create.setOnShowListener(new klv(obj4, b, 5));
                create.show();
                return;
            case 10:
                xze xzeVar = aalt.c;
                this.a.a();
                return;
            case 11:
                xze xzeVar2 = aalt.c;
                this.a.a();
                return;
            case 12:
                xze xzeVar3 = aalt.c;
                this.a.a();
                return;
            case 13:
                ((aalt) this.a).v(2, 2, 2, 1);
                return;
            case 14:
                ((aalt) this.a).v(2, 1, 2, 2);
                return;
            case 15:
                ((aalt) this.a).v(2, 2, 2, 2);
                return;
            case 16:
                ((aalt) this.a).v(2, 3, 1, 1);
                return;
            case 17:
                ((aalt) this.a).v(2, 3, 2, 1);
                return;
            case 18:
                ((aalt) this.a).v(2, 3, 2, 2);
                return;
            case 19:
                ((via) ((aalt) this.a).f.b()).t(new ConversationIdType(1L), "911");
                return;
            default:
                ((aalt) this.a).v(1, 2, 0, 0);
                return;
        }
    }
}
