package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpa extends FrameLayout {
    public MessagePartCoreData a;
    final FrameLayout b;
    final ImageButton c;
    public final zop d;
    private final xuo e;
    private final xum f;
    private final aksr g;

    public zpa(Context context, zop zopVar, xuo xuoVar, xum xumVar, aksr aksrVar) {
        super(context);
        this.f = xumVar;
        this.g = aksrVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.attachment_preview_m2, (ViewGroup) this, true);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.close_button);
        this.c = imageButton;
        imageButton.setImageResource(R.drawable.remove_attachment_element_gm3);
        this.b = (FrameLayout) inflate.findViewById(R.id.attachment_view);
        this.d = zopVar;
        this.e = xuoVar;
        setVisibility(4);
    }

    public final synchronized void a(MessagePartCoreData messagePartCoreData) {
        this.a = messagePartCoreData;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [xun, java.lang.Object] */
    public final void b() {
        MessagePartCoreData messagePartCoreData = this.a;
        messagePartCoreData.getClass();
        this.c.setOnClickListener(new akwb(this.g, "SingleAttachmentPreview closeButton onClick", new zoz(this, messagePartCoreData, 0), 1));
        setVisibility(0);
        znj g = this.f.g(LayoutInflater.from(getContext()), messagePartCoreData, this.b, 3, this.d);
        if (g != null) {
            Object obj = g.b;
            if (obj != null) {
                AudioAttachmentView audioAttachmentView = (AudioAttachmentView) ((View) obj).findViewById(R.id.audio_attachment_view);
                if (audioAttachmentView != null) {
                    audioAttachmentView.b(this.e);
                }
                this.b.removeAllViews();
                this.b.addView((View) g.b);
            }
            ?? r0 = g.a;
            if (r0 != 0) {
                r0.g(messagePartCoreData, false, 3);
            }
        }
    }
}
