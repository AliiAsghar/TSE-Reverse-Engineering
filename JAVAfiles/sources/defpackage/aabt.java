package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aabt implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aabt(aabu aabuVar, EditText editText, CheckBox checkBox, int i) {
        this.d = i;
        this.a = aabuVar;
        this.b = editText;
        this.c = checkBox;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, arpe] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable wobVar;
        Runnable wobVar2;
        int i2 = i;
        int i3 = 2;
        int i4 = 3;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                String obj = ((EditText) this.b).getText().toString();
                aabu aabuVar = (aabu) this.a;
                aabuVar.a.d();
                aabuVar.c(aabuVar.f, ((CheckBox) this.c).isChecked());
                if (!TextUtils.isEmpty(obj)) {
                    int i5 = aabuVar.f;
                    aabuVar.l.x(i5).l(aabuVar.a.S(R.string.mms_phone_number_pref_key), obj);
                    if (((Boolean) zke.a.e()).booleanValue()) {
                        aabuVar.e.j(ahlp.l(aabuVar.k.a(i5).d(obj)), new ahlp(Integer.valueOf(i5)), aabuVar.j);
                    } else {
                        aabuVar.b(i5);
                    }
                    if (aabuVar.h) {
                        aabuVar.c.h(R.string.toast_after_entered_phone_number_for_sending);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ?? r6 = this.a;
                Object obj2 = this.c;
                iqa iqaVar = (iqa) this.b;
                qjh.l(iqaVar.e, null, new mgq(i, iqaVar, (Uri) obj2, (arpe) r6, (arpe) null, 1), 3);
                return;
            case 2:
                Object obj3 = this.b;
                Object obj4 = this.c;
                Object obj5 = this.a;
                try {
                    int parseInt = Integer.parseInt(((TextView) obj4).getText().toString());
                    int parseInt2 = Integer.parseInt(((TextView) obj3).getText().toString());
                    yck yckVar = ((DebugMmsConfigFragment) obj5).ag;
                    int i6 = ((DebugMmsConfigFragment) obj5).c;
                    Integer[] numArr = {Integer.valueOf(parseInt), Integer.valueOf(parseInt2)};
                    ycl yclVar = (ycl) yckVar.e.b();
                    if (yclVar.b == null) {
                        yclVar.b = new SparseArray();
                    }
                    yclVar.b.put(i6, numArr);
                    ((DebugMmsConfigFragment) obj5).d.a();
                    ((DebugMmsConfigFragment) obj5).d(false);
                } catch (NumberFormatException e) {
                    Log.w("Bugle", "MCC or MNC passed in was not able to be parsed to an integer: ", e);
                }
                ((DebugMmsConfigFragment) obj5).a.dismiss();
                return;
            case 3:
                Object obj6 = this.b;
                String str = "Won't force any MMS status anymore";
                if (i2 == 0) {
                    if (((Boolean) yck.b.e()).booleanValue()) {
                        i2 = 0;
                    } else {
                        aalt aaltVar = (aalt) obj6;
                        ((yck) aaltVar.V.b()).c();
                        ((abbu) aaltVar.Z.b()).l("Won't force any MMS status anymore");
                        return;
                    }
                }
                CharSequence charSequence = ((CharSequence[]) this.a)[i2];
                int parseInt3 = Integer.parseInt((String) alzz.aM(anna.e(' ').a(charSequence.toString()), 0));
                if (i2 != 0) {
                    str = "Will force new MMS messages to ".concat(String.valueOf(String.valueOf(charSequence)));
                }
                String str2 = str;
                if (((Boolean) yck.b.e()).booleanValue()) {
                    Object obj7 = this.c;
                    if (i2 == 0) {
                        wobVar = new aaki(obj6, obj7, i3);
                    } else {
                        wobVar = new wob(obj6, parseInt3, obj7, 5, (byte[]) null);
                    }
                    ((aalt) obj6).n((Activity) obj7, "forceMmsDownloadStatusFailure", charSequence, wobVar, new aaki(obj7, dialogInterface, i4, bArr), str2);
                    return;
                }
                aalt aaltVar2 = (aalt) obj6;
                ((yck) aaltVar2.V.b()).k(parseInt3);
                ((abbu) aaltVar2.Z.b()).l(str2);
                return;
            case 4:
                Object obj8 = this.a;
                Object obj9 = this.c;
                Object obj10 = this.b;
                try {
                    MessageIdType b = rvc.b(((EditText) obj9).getText().toString());
                    qiu.h(aktp.ai(new ytr(b, 13), ((aalt) obj10).ai).h(new xpm(((zof) obj8).b, b, 19, bArr), ((aalt) obj10).I));
                    return;
                } catch (Exception e2) {
                    ((abbu) ((aalt) obj10).Z.b()).l("Failed to show specific message annotations: ".concat(String.valueOf(e2.getMessage())));
                    return;
                }
            case 5:
                fcp fcpVar = new fcp(((aalt) this.b).y, (byte[]) null);
                fcpVar.h("text/csv");
                Object obj11 = this.a;
                Context context = (Context) this.c;
                fcpVar.f(uti.d(context, (String) obj11));
                Intent e3 = fcpVar.e();
                e3.setFlags(1);
                akto.n(context, e3);
                dialogInterface.dismiss();
                return;
            case 6:
                this.b.run();
                Object obj12 = this.a;
                if (obj12 != null) {
                    ((abbu) ((aalt) this.c).Z.b()).l((String) obj12);
                    return;
                }
                return;
            case 7:
                Object obj13 = this.b;
                String str3 = "Won't force MMS send result status anymore";
                if (i2 == 0) {
                    if (((Boolean) yck.b.e()).booleanValue()) {
                        i2 = 0;
                    } else {
                        aalt aaltVar3 = (aalt) obj13;
                        ((yck) aaltVar3.V.b()).d();
                        ((abbu) aaltVar3.Z.b()).l("Won't force MMS send result status anymore");
                        return;
                    }
                }
                CharSequence charSequence2 = ((CharSequence[]) this.a)[i2];
                int parseInt4 = Integer.parseInt((String) alzz.aM(anna.e(' ').a(charSequence2.toString()), 0));
                if (i2 != 0) {
                    str3 = "Will force MMS send result status to ".concat(String.valueOf(String.valueOf(charSequence2)));
                }
                if (((Boolean) yck.b.e()).booleanValue()) {
                    Object obj14 = this.c;
                    if (i2 == 0) {
                        wobVar2 = new aaki(obj13, obj14, 11);
                    } else {
                        wobVar2 = new wob(obj13, parseInt4, obj14, 6, (byte[]) null);
                    }
                    ((aalt) obj13).n((Activity) obj14, "forceMmsSendResultStatusFailure", charSequence2, wobVar2, new aaki(obj14, dialogInterface, 12, bArr), str3);
                    return;
                }
                aalt aaltVar4 = (aalt) obj13;
                ((yck) aaltVar4.V.b()).l(parseInt4);
                ((abbu) aaltVar4.Z.b()).l(str3);
                return;
            default:
                akrc b2 = ((aksr) this.b).b((String) this.a);
                try {
                    this.c.onClick(dialogInterface, i2);
                    b2.close();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ aabt(aalt aaltVar, Activity activity, int i) {
        this.d = i;
        this.b = aaltVar;
        this.c = activity;
        this.a = "conversation_participants_history.csv";
    }

    public /* synthetic */ aabt(aalt aaltVar, EditText editText, zof zofVar, int i) {
        this.d = i;
        this.b = aaltVar;
        this.c = editText;
        this.a = zofVar;
    }

    public /* synthetic */ aabt(aalt aaltVar, Runnable runnable, String str, int i) {
        this.d = i;
        this.c = aaltVar;
        this.b = runnable;
        this.a = str;
    }

    public /* synthetic */ aabt(DebugMmsConfigFragment debugMmsConfigFragment, TextView textView, TextView textView2, int i) {
        this.d = i;
        this.a = debugMmsConfigFragment;
        this.c = textView;
        this.b = textView2;
    }

    public aabt(iqa iqaVar, Uri uri, arpe arpeVar, int i) {
        this.d = i;
        this.b = iqaVar;
        this.c = uri;
        this.a = arpeVar;
    }

    public /* synthetic */ aabt(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
