package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoj extends xum {
    public zoj(yai yaiVar, yti ytiVar, aksr aksrVar) {
        super(yaiVar, ytiVar, aksrVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xum
    public final int b(int i) {
        switch (i - 1) {
            case 0:
                return R.id.image_attachment_view;
            case 1:
                return R.id.audio_attachment_view;
            case 2:
                return R.id.video_attachment_view;
            case 3:
                return R.id.vcard_attachment_view;
            case 4:
            default:
                xyl.c("unsupported or unknown attachment view type!");
                return -1;
            case 5:
                return R.id.pending_item_view;
            case 6:
                return R.id.file_attachment_view;
            case 7:
                return R.id.cms_click_to_download_view;
            case 8:
                return R.id.missing_attachment_view;
            case 9:
                return R.id.cms_broken_media_view;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xum
    public final int c(int i, int i2) {
        if (i2 == 9) {
            return R.layout.attachment_single_missing;
        }
        if (i2 == 1) {
            if (i != 1) {
                if (i != 3) {
                    xyl.c("unsupported or unknown attachment view type!");
                    return -1;
                }
                return R.layout.attachment_compose_image;
            }
            return R.layout.attachment_single_image;
        }
        if (i2 == 4) {
            if (i != 1) {
                if (i != 3) {
                    xyl.c("unsupported or unknown attachment view type!");
                    return -1;
                }
                return R.layout.attachment_compose_vcard_consistent;
            }
            return R.layout.attachment_single_vcard_consistent;
        }
        if (i2 == 2) {
            if (i != 1) {
                if (i != 3) {
                    xyl.c("unsupported or unknown attachment view type!");
                    return -1;
                }
                return R.layout.audio_attachment_compact;
            }
            return R.layout.audio_attachment_normal;
        }
        if (i2 == 3) {
            if (i != 1) {
                if (i != 3) {
                    xyl.c("unsupported or unknown attachment view type!");
                    return -1;
                }
                return R.layout.attachment_compose_video;
            }
            return R.layout.attachment_single_video;
        }
        if (i2 == 6) {
            return R.layout.attachment_pending_item;
        }
        if (i2 == 7) {
            if (i != 3) {
                return R.layout.attachment_single_file;
            }
            return R.layout.attachment_compose_file;
        }
        if (i2 == 8) {
            return R.layout.attachment_click_to_download_media;
        }
        if (i2 == 10) {
            return R.layout.attachment_cms_broken_media;
        }
        xyl.c("Unsupported attachment type");
        return -1;
    }

    @Override // defpackage.xum
    protected final znj d(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, PendingAttachmentData pendingAttachmentData) {
        boolean z;
        int c = c(i, 6);
        int b = b(6);
        int i2 = 0;
        View inflate = layoutInflater.inflate(c, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(b);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        xyl.k(z);
        int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.compose_attachment_size);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        if (this.c != null) {
            zqd zqdVar = new zqd(r7.getDimensionPixelSize(R.dimen.progress_indicator_default_radius), viewGroup.getResources().getDimensionPixelSize(R.dimen.progress_indicator_default_stroke_width));
            zqdVar.setVisible(true, true);
            imageView.setImageDrawable(zqdVar);
        }
        znj znjVar = new znj((Object) null, inflate, (byte[]) null);
        TextView textView = (TextView) ((View) znjVar.b).findViewById(R.id.caption);
        if (textView != null) {
            String ad = pendingAttachmentData.ad();
            if (true == TextUtils.isEmpty(ad)) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            textView.setText(ad);
        }
        return znjVar;
    }

    @Override // defpackage.xum
    protected final znj e(LayoutInflater layoutInflater, MessagePartCoreData messagePartCoreData, ViewGroup viewGroup, int i) {
        int c = c(i, 3);
        int b = b(3);
        boolean z = false;
        View inflate = layoutInflater.inflate(c, viewGroup, false);
        zpj E = ((VideoAttachmentView) inflate.findViewById(b)).E();
        if (messagePartCoreData.t() != null) {
            z = true;
        }
        a(inflate, z);
        return new znj(E, inflate, (byte[]) null);
    }

    @Override // defpackage.xum
    protected final znj f(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        int c = c(i, i2);
        int b = b(i2);
        View inflate = layoutInflater.inflate(c, viewGroup, false);
        xun xunVar = (xun) akec.z(inflate.findViewById(b));
        xum.a(inflate, true);
        return new znj(xunVar, inflate, (byte[]) null);
    }
}
