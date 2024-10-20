package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.media.CmsMediaAttachmentView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihz implements xun {
    private final CmsMediaAttachmentView a;
    private final ProgressBar b;

    public ihz(CmsMediaAttachmentView cmsMediaAttachmentView, zpt zptVar) {
        View.inflate(cmsMediaAttachmentView.getContext(), R.layout.cms_click_to_download_view, cmsMediaAttachmentView);
        this.a = cmsMediaAttachmentView;
        this.b = (ProgressBar) cmsMediaAttachmentView.findViewById(R.id.progress);
        ViewGroup viewGroup = (ViewGroup) cmsMediaAttachmentView.findViewById(R.id.icon_container);
        viewGroup.setBackground(zptVar.m());
        viewGroup.setOnClickListener(new jh(this, 11, null));
    }

    public final void a() {
        this.b.setVisibility(0);
    }

    @Override // defpackage.xun
    public final void c() {
        this.a.setTag(R.id.cms_attachment_icon_tag, null);
        this.b.setVisibility(4);
    }

    @Override // defpackage.xun
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, int i) {
        Uri t = messagePartCoreData.t();
        if (t != null) {
            this.a.setTag(R.id.cms_attachment_icon_tag, t.toString());
        }
        if (messagePartCoreData.F() == tqd.CMS_MEDIA_DOWNLOADING) {
            a();
        }
    }

    @Override // defpackage.xul
    public final void d(boolean z, rry rryVar, Drawable drawable, float[] fArr) {
    }
}
