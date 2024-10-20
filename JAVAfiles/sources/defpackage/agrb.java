package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.android.libraries.stickers.gallery.StickerSearchView;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;
import com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrb implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public agrb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StickerGalleryActivity stickerGalleryActivity;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((agre) this.a).b();
                ((agre) this.a).a.dismissAllowingStateLoss();
                return;
            case 1:
                ((agem) this.a).aY();
                return;
            case 2:
                ((agre) this.a).b();
                ((agre) this.a).a.dismissAllowingStateLoss();
                return;
            case 3:
                ((SurveyPromptActivity) this.a).z();
                return;
            case 4:
                ((SurveyPromptActivity) this.a).C("o");
                ((SurveyPromptActivity) this.a).y();
                ((SurveyPromptActivity) this.a).finish();
                return;
            case 5:
                ((SurveyPromptActivity) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((SurveyPromptActivity) this.a).u)));
                ((SurveyPromptActivity) this.a).finish();
                return;
            case 6:
                ((CheckBox) this.a).performClick();
                return;
            case 7:
                ((agvr) this.a).d.run();
                return;
            case 8:
                agyx.a(view.getContext()).d(view);
                if (view instanceof CustomImageView) {
                    Object obj = this.a;
                    agxx agxxVar = ((CustomImageView) view).a;
                    alog alogVar = ((agvz) ((agvu) ((agvz) obj).A).a).h;
                    if (((alsx) alogVar).c <= 0) {
                        return;
                    }
                    throw null;
                }
                ((alvg) ((alvg) agvz.a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "<init>", 332, "EmojiPickerController.java")).t("Clicked view is not CustomImageView: %s", view);
                return;
            case 9:
                agxv agxvVar = ((EmojiView) view).c;
                agvu agvuVar = (agvu) ((agvz) this.a).A;
                agvz agvzVar = (agvz) agvuVar.a;
                if (agvzVar.o) {
                    alog alogVar2 = agvzVar.h;
                    for (int i = 0; i < ((alsx) alogVar2).c; i++) {
                        ((agvj) alogVar2.get(i)).d(aglo.w(agxvVar.b));
                    }
                }
                agvz agvzVar2 = (agvz) agvuVar.a;
                if (agvzVar2.g && agvzVar2.l.d(agxvVar.b)) {
                    z = true;
                }
                agvr agvrVar = ((agvz) agvuVar.a).y;
                if (agvrVar != null) {
                    agvrVar.J(agxvVar, z);
                }
                agvx agvxVar = ((agvz) agvuVar.a).c;
                if (agvxVar != null) {
                    agxvVar.getClass();
                    String str = agxvVar.b;
                    str.getClass();
                    ((afpg) ((agvu) agvxVar).a).m.a(str, true);
                }
                ((agvz) agvuVar.a).C.a();
                return;
            case 10:
                if (view instanceof EmojiView) {
                    agyx.a(view.getContext()).d(view);
                    View.OnClickListener onClickListener = ((agwk) this.a).c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    ((agwk) this.a).a();
                    return;
                }
                ((alvg) ((alvg) agwk.a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController$1", "onClick", 82, "EmojiPickerPopupViewController.java")).t("Clicked view is not EmojiView: %s", view);
                return;
            case 11:
                aiqn aiqnVar = (aiqn) this.a;
                StickerGalleryActivity stickerGalleryActivity2 = aiqnVar.s.h;
                if (stickerGalleryActivity2 != null) {
                    stickerGalleryActivity2.z();
                    aiqq aiqqVar = aiqnVar.s;
                    aodc aodcVar = aodc.BROWSE;
                    aozy createBuilder = aodd.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ((aodd) apagVar).b = aode.a(15);
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    aiqj aiqjVar = aiqqVar.g;
                    ((aodd) createBuilder.b).e = aodcVar.a();
                    ((airh) aiqjVar.g).a((aodd) createBuilder.s());
                    return;
                }
                return;
            case 12:
                aiqz aiqzVar = (aiqz) this.a;
                ((agcp) aiqzVar.h.k).x(false);
                aiqzVar.e(true);
                return;
            case 13:
                airg airgVar = (airg) this.a;
                if (!airgVar.f() && (stickerGalleryActivity = airgVar.l) != null) {
                    stickerGalleryActivity.finish();
                    return;
                }
                return;
            case 14:
                StickerSearchView stickerSearchView = (StickerSearchView) this.a;
                stickerSearchView.a.setText("");
                stickerSearchView.b(stickerSearchView.a);
                return;
            case 15:
                PackDetailsActivity packDetailsActivity = ((airr) this.a).o;
                if (packDetailsActivity != null) {
                    packDetailsActivity.finish();
                    return;
                }
                return;
            case 16:
                ((CheckBox) this.a).performClick();
                return;
            case 17:
                int i2 = PlatformSystemInfoDialogFragment.a;
                ((ev) this.a).cancel();
                return;
            case 18:
                ajap ajapVar = (ajap) this.a;
                ajapVar.c.e = true;
                aiyz a = ajapVar.a();
                if (a != null) {
                    ahnz.a.q(a);
                }
                ajapVar.i(ajapVar.d, ajapVar.k, ajapVar.h, aizr.j(ajapVar.f));
                ajapVar.h();
                return;
            case 19:
                ajap ajapVar2 = (ajap) this.a;
                ajapVar2.c.e = false;
                aiyz a2 = ajapVar2.a();
                if (a2 != null) {
                    ahnz.a.q(a2);
                }
                ajapVar2.j(ajapVar2.d, ajapVar2.k, ajapVar2.h, aizr.j(ajapVar2.f));
                ajapVar2.i(ajapVar2.d, ajapVar2.k, ajapVar2.h, aizr.j(ajapVar2.f));
                ajapVar2.b.dismissAllowingStateLoss();
                return;
            default:
                int i3 = ajbh.b;
                Object obj2 = this.a;
                ((EditText) obj2).requestFocus();
                aizr.h((View) obj2);
                view.scrollTo(0, view.getBottom());
                return;
        }
    }

    public /* synthetic */ agrb(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
