package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import com.google.android.libraries.hats20.view.RatingView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aarn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aarn(adea adeaVar, int i, Activity activity, int i2) {
        this.d = i2;
        this.c = adeaVar;
        this.a = i;
        this.b = activity;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [armf, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        alog n;
        int i = this.d;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ajax.b((ViewGroup) this.b);
                                new Handler().postDelayed(new ebm(this.c, this.a, 19), 250L);
                                return;
                            }
                            ajax.b((ViewGroup) this.b);
                            new Handler().postDelayed(new ajbz(this.c, this.a, i2), 250L);
                            return;
                        }
                        ajax.b((ViewGroup) this.b);
                        new Handler().postDelayed(new ebm(this.c, this.a, 20), 250L);
                        return;
                    }
                    int i3 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) this.b;
                        if (i3 >= viewGroup.getChildCount()) {
                            break;
                        }
                        viewGroup.getChildAt(i3).setOnClickListener(null);
                        viewGroup.getChildAt(i3).setClickable(false);
                        i3++;
                    }
                    agsd agsdVar = ((RatingView) this.c).a;
                    if (agsdVar != null) {
                        agsdVar.a(this.a);
                        return;
                    }
                    return;
                }
                adea adeaVar = (adea) this.c;
                ((zfj) adeaVar.d.b()).b(this.a, 4);
                ((mce) adeaVar.c.b()).b("Bugle.UI.ContactPickerActivity.InitiateToContactsShown.Duration");
                ((mce) adeaVar.c.b()).b("Bugle.UI.ContactPickerActivity.InitiateToEntryReady.Duration");
                ((qoq) adeaVar.b.b()).s((Context) this.b, Optional.empty());
                return;
            }
            zpj zpjVar = (zpj) this.b;
            if (zpjVar.a == null) {
                return;
            }
            if (!((iyh) this.c.b()).d()) {
                zpjVar.d.performClick();
                return;
            }
            float[] fArr = zpjVar.f.v;
            if (fArr == null) {
                int i4 = alog.d;
                n = alsx.a;
            } else {
                n = alog.n(albo.cB(fArr));
            }
            int i5 = this.a;
            VideoAttachmentView videoAttachmentView = zpjVar.d;
            RoundedImageView roundedImageView = zpjVar.f;
            Uri uri = zpjVar.a;
            uri.getClass();
            aktp.L(new zpd(videoAttachmentView, roundedImageView, i5, n, uri), zpjVar.d);
            return;
        }
        aaro aaroVar = (aaro) this.b;
        aarm aarmVar = aaroVar.a;
        SelectableContentItemView selectableContentItemView = (SelectableContentItemView) this.c;
        if (!aarmVar.c.u(selectableContentItemView.h, selectableContentItemView.k)) {
            int i6 = this.a;
            aaroVar.a.c.q((GalleryContent) selectableContentItemView.h, (GalleryContentItem) selectableContentItemView.g, true ^ selectableContentItemView.k, i6);
        }
    }

    public /* synthetic */ aarn(ajax ajaxVar, ViewGroup viewGroup, int i, int i2) {
        this.d = i2;
        this.c = ajaxVar;
        this.b = viewGroup;
        this.a = i;
    }

    public aarn(RatingView ratingView, ViewGroup viewGroup, int i, int i2) {
        this.d = i2;
        this.b = viewGroup;
        this.a = i;
        this.c = ratingView;
    }

    public /* synthetic */ aarn(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
