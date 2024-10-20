package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aajo implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aajo(arvo arvoVar, int i) {
        this.b = i;
        this.a = arvoVar;
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, aayl] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Object, arpe] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((DebugMmsConfigFragment) this.a).a.cancel();
                return;
            case 1:
                aain aainVar = (aain) this.a;
                aainVar.l = true;
                aainVar.k.c();
                return;
            case 2:
                DebugMmsConfigFragment debugMmsConfigFragment = (DebugMmsConfigFragment) this.a;
                armf armfVar = debugMmsConfigFragment.ag.e;
                int i2 = debugMmsConfigFragment.c;
                ycl yclVar = (ycl) armfVar.b();
                if (yclVar.b != null) {
                    yclVar.b.remove(i2);
                    if (yclVar.b.size() == 0) {
                        yclVar.b = null;
                    }
                }
                debugMmsConfigFragment.d.a();
                debugMmsConfigFragment.a();
                debugMmsConfigFragment.a.dismiss();
                return;
            case 3:
                Object obj = this.a;
                try {
                    int b = ((wzs) ((aalt) obj).q.b()).b(((aalt) obj).m.f().toEpochMilli());
                    if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                        ((wzp) ((aalt) obj).n.b()).l(amvm.DEBUG_UTILS_DELETE_ALL_CONVERSATIONS);
                    } else {
                        ((wzp) ((aalt) obj).n.b()).h();
                    }
                    ((abbu) ((aalt) obj).Z.b()).l(a.cq(b, " messages deleted!  Synchronizing in background."));
                    return;
                } catch (Exception e) {
                    ((abbu) ((aalt) obj).Z.b()).l("Error: ".concat(String.valueOf(e.getMessage())));
                    return;
                }
            case 4:
                xze xzeVar = aalt.c;
                ?? r6 = this.a;
                if (r6 != 0) {
                    r6.run();
                    return;
                }
                return;
            case 5:
                alvw e2 = aaoq.a.e();
                e2.X(alwp.a, "BugleWearable");
                alvg alvgVar = (alvg) e2;
                alvgVar.X(ydl.M, "WearableDebugMenuProvider");
                ((alvg) alvgVar.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceEnableWearSync$lambda$3", 156, "WearableDebugMenuProvider.kt")).q("Marking watch as online from debug menu with missing WearOS modules.");
                this.a.run();
                return;
            case 6:
                ((aats) this.a).e(amqd.UNKNOWN_CLOSING_SOURCE);
                return;
            case 7:
                this.a.i();
                return;
            case 8:
                aozy createBuilder = whl.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.a;
                ((whl) createBuilder.b).b = a.an(4);
                aayq aayqVar = (aayq) obj2;
                aayqVar.d.j(ahlp.l(aayqVar.a((whl) createBuilder.s())), new ahlp((Object) false), aayqVar.h);
                return;
            case 9:
                xzb.j("Bugle", "TermsAndConditions: rejected.");
                Object obj3 = this.a;
                aayq aayqVar2 = (aayq) obj3;
                AlertDialog.Builder title = new AlertDialog.Builder(aayqVar2.a.fe()).setTitle(R.string.terms_and_conditions_rejected_dialog_title_v2);
                aayp aaypVar = aayqVar2.a;
                AlertDialog.Builder cancelable = title.setMessage(aaypVar.T(R.string.terms_and_conditions_rejected_dialog_text_new_v2, aaypVar.S(R.string.rcs_settings_v2))).setCancelable(false);
                int i3 = 8;
                cancelable.setPositiveButton(R.string.terms_and_conditions_rejected_dialog_positive_button_text, new aabt(aayqVar2.e, "RcsTermsAndConditionsFragmentPeer:showTermsAndConditionsRejectedDialog:positive", new aajo(obj3, i3), i3)).create().show();
                return;
            case 10:
                this.a.run();
                return;
            case 11:
                ((Activity) this.a).startActivityForResult(new Intent("android.settings.SETTINGS"), 0);
                return;
            case 12:
                ((rry) this.a).o = true;
                return;
            case 13:
                ((abbj) this.a).g.k(R.string.report_spam_toast_title);
                return;
            case 14:
                abbj abbjVar = (abbj) this.a;
                ((mho) abbjVar.b.b()).S(amlw.RCS_PROVISIONING_PROMPT_DECLINED, amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
                abbjVar.d.c("Bugle.FastTrack.Settings.Dialog.Declined");
                dialogInterface.dismiss();
                return;
            case 15:
                this.a.run();
                return;
            case 16:
                this.a.w(true);
                return;
            case 17:
                this.a.w(false);
                return;
            default:
                ((StickerGalleryActivity) this.a).finish();
                return;
        }
    }

    public /* synthetic */ aajo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
