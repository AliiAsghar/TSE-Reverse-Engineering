package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertController;
import android.text.Editable;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ise implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ise(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, aayl] */
    /* JADX WARN: Type inference failed for: r0v33, types: [akvv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v42, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Button button;
        String str;
        int i2 = 16;
        int i3 = 20;
        boolean z = false;
        int i4 = 1;
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) Collection.EL.stream(((iyh) this.b).b()).map(new idc(i3)).collect(Collectors.toCollection(new ijk(2)));
                itb itbVar = (itb) this.a;
                xzb.k("Bugle", "UI initiated message %s deletion in conversation %s", arrayList, itbVar.af);
                if (itbVar.aN.a()) {
                    ((mkp) itbVar.i.b()).i(arrayList, 8);
                } else {
                    ((mkp) itbVar.i.b()).c(arrayList);
                }
                MessageListRecyclerView messageListRecyclerView = itbVar.ao;
                xwr.i(messageListRecyclerView, messageListRecyclerView.getResources().getQuantityString(R.plurals.message_deleted_count, arrayList.size(), Integer.valueOf(arrayList.size())));
                itbVar.j();
                return;
            case 1:
                akto.n(((itb) this.b).f.F(), new Intent("android.intent.action.VIEW").setData((Uri) this.a));
                return;
            case 2:
                ((rw) this.a).c(lqn.g("android.settings.REQUEST_SCHEDULE_EXACT_ALARM").a().setData(Uri.parse("package:".concat(String.valueOf(((ixd) this.b).q().getPackageName())))));
                return;
            case 3:
                ((jam) ((jat) this.b).g).a = i;
                ((ArrayAdapter) this.a).notifyDataSetChanged();
                return;
            case 4:
                akto.n((Context) this.a, new Intent("android.intent.action.VIEW", Uri.parse((String) ((vco) this.b).a.b())));
                return;
            case 5:
                Editable text = ((kn) this.a).getText();
                if (text == null) {
                    return;
                }
                Object obj = this.b;
                if (((Boolean) new mst(16).get()).booleanValue()) {
                    PhoneNumberPreference phoneNumberPreference = (PhoneNumberPreference) obj;
                    phoneNumberPreference.l(phoneNumberPreference.a.b().n(text.toString()));
                    return;
                } else {
                    ((PhoneNumberPreference) obj).o(text.toString());
                    return;
                }
            case 6:
                aabu aabuVar = (aabu) this.b;
                aabuVar.a.d();
                aabuVar.c(aabuVar.f, ((CheckBox) this.a).isChecked());
                return;
            case 7:
                Context applicationContext = ((Activity) this.a).getApplicationContext();
                Object obj2 = this.b;
                aakf aakfVar = new aakf(obj2, applicationContext, i4);
                zxy zxyVar = (zxy) obj2;
                aktp.ai(aakfVar, zxyVar.e).h(new zet(obj2, 11), zxyVar.e);
                return;
            case 8:
                ((aaoc) ((aalt) this.a).bh.b()).f((Context) ((zof) this.b).b, kmz.c);
                return;
            case 9:
                Object obj3 = this.b;
                aalt aaltVar = (aalt) obj3;
                zxy zxyVar2 = (zxy) aaltVar.Y.b();
                aktp.ai(new yxs(zxyVar2, ((Activity) this.a).getApplicationContext(), i3), zxyVar2.e).h(new zet(obj3, i2), aaltVar.aW);
                return;
            case 10:
                Object obj4 = this.a;
                final aalt aaltVar2 = (aalt) this.b;
                final Activity activity = (Activity) obj4;
                qiu.h(aktp.ah(new Runnable() { // from class: aakz
                    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r10v6, types: [msk, java.lang.Object] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 651
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aakz.run():void");
                    }
                }, aaltVar2.aW));
                return;
            case 11:
                Object obj5 = this.a;
                if (i == 1) {
                    z = true;
                }
                aapp aappVar = (aapp) obj5;
                aappVar.b = z;
                aappVar.k((amqe) this.b);
                return;
            case 12:
                this.b.k((Activity) this.a);
                dialogInterface.dismiss();
                return;
            case 13:
                ((ksm) ((abbj) this.b).h.b()).e((Context) this.a, (String) utw.T.e());
                return;
            case 14:
                ((lzv) ((abbj) this.b).f.b()).K(this.a);
                return;
            default:
                AlertController alertController = ((ev) dialogInterface).a;
                ?? r0 = this.a;
                if (i != -3) {
                    if (i != -2) {
                        if (i != -1) {
                            button = null;
                        } else {
                            button = alertController.j;
                        }
                    } else {
                        button = alertController.m;
                    }
                } else {
                    button = alertController.p;
                }
                if (!aktp.t(button)) {
                    return;
                }
                if (i != -3) {
                    if (i != -2) {
                        if (i != -1) {
                            str = "Clicked dialog button";
                        } else {
                            str = "Clicked positive dialog button";
                        }
                    } else {
                        str = "Clicked negative dialog button";
                    }
                } else {
                    str = "Clicked neutral dialog button";
                }
                akrc d = ((aksr) ((aohs) this.b).b).d(str);
                try {
                    aktp.L(r0, button);
                    d.close();
                    return;
                } catch (Throwable th) {
                    try {
                        d.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ ise(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
