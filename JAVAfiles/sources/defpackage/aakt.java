package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aakt implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ aakt(aalt aaltVar, CheckBox checkBox, ArrayAdapter arrayAdapter, ld ldVar, Activity activity, int i) {
        this.f = i;
        this.a = aaltVar;
        this.b = checkBox;
        this.c = arrayAdapter;
        this.d = ldVar;
        this.e = activity;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [apwt, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj;
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 != 1) {
                ((lzv) ((abbj) this.c).f.b()).L((Uri) this.e, (String) this.b, (Uri) this.d, (String) this.a);
                return;
            }
            ?? r8 = this.a;
            Object obj2 = this.d;
            int size = r8.size();
            lfl lflVar = (lfl) obj2;
            if (xwr.h((Context) lflVar.a) && (obj = this.e) != null) {
                xwr.i((View) obj, ((cj) lflVar.a).getResources().getQuantityString(R.plurals.deleted_toast_message, size, Integer.valueOf(size)));
            }
            for (SelectedConversation selectedConversation : r8) {
                ((mbl) lflVar.d.b()).c("Bugle.UI.DeleteConversation");
                kkg kkgVar = (kkg) lflVar.c.b();
                if (uyh.a() && selectedConversation.o == 4) {
                    uyq uyqVar = (uyq) ((Optional) ((apxx) kkgVar.d).a).get();
                    selectedConversation.r.getClass();
                    ConversationIdType conversationIdType = selectedConversation.a;
                    uyqVar.a();
                } else {
                    Object obj3 = this.c;
                    qoz qozVar = (qoz) kkgVar.b.b();
                    qox a = qoy.a();
                    a.f((amfe) obj3);
                    a.b(selectedConversation.a);
                    a.d(SuperSortLabel.UNKNOWN);
                    a.c(((xnv) kkgVar.c.b()).f().toEpochMilli());
                    qozVar.a(a.a());
                }
            }
            this.b.run();
            return;
        }
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.a;
        try {
            ((abbu) ((aalt) obj8).Z.b()).l("Generating the file.");
            ArrayList arrayList = new ArrayList();
            if (((CheckBox) obj7).isChecked()) {
                arrayList.add(new aalx(2));
            }
            aaly aalyVar = (aaly) ((aalt) obj8).Q.b();
            aalw aalwVar = (aalw) ((ArrayAdapter) obj6).getItem(((ld) obj5).getSelectedItemPosition());
            aalwVar.getClass();
            qiu.i(akul.g(aktp.ai(new xqt(aalyVar, aalwVar, arrayList, 11), aalyVar.f)), new aakw(obj4, 15), ((aalt) obj8).I);
        } catch (Exception e) {
            ((abbu) ((aalt) obj8).Z.b()).l("Error: ".concat(String.valueOf(e.getMessage())));
        }
        dialogInterface.dismiss();
    }

    public /* synthetic */ aakt(abbj abbjVar, Uri uri, String str, Uri uri2, String str2, int i) {
        this.f = i;
        this.c = abbjVar;
        this.e = uri;
        this.b = str;
        this.d = uri2;
        this.a = str2;
    }

    public /* synthetic */ aakt(lfl lflVar, ViewGroup viewGroup, Collection collection, amfe amfeVar, Runnable runnable, int i) {
        this.f = i;
        this.d = lflVar;
        this.e = viewGroup;
        this.a = collection;
        this.c = amfeVar;
        this.b = runnable;
    }
}
