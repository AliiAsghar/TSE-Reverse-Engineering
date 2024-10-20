package defpackage;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aase extends aapy {
    public View e;
    private final aasm f;
    private final int g;
    private final ahjj h;

    private aase(aasm aasmVar, int i, int i2, int i3, ahjj ahjjVar) {
        super(aasmVar, i, i2);
        this.f = aasmVar;
        this.g = i3;
        this.h = ahjjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aase I(aasm aasmVar, int i, int i2, int i3, ahjj ahjjVar) {
        aase aaseVar = new aase(aasmVar, i, i2, i3, ahjjVar);
        aaseVar.A(true);
        return aaseVar;
    }

    @Override // defpackage.aapy
    protected final oo F(ViewGroup viewGroup, int i) {
        View inflate;
        int i2;
        if (i != 2) {
            if (i != 3) {
                if (i != 8) {
                    if (i != 12) {
                        boolean booleanValue = ((Boolean) utw.M.e()).booleanValue();
                        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                        if (true != booleanValue) {
                            i2 = R.layout.compose2o_gallery_item_view;
                        } else {
                            i2 = R.layout.compose2o_camera_gallery_roll_item_view;
                        }
                        inflate = from.inflate(i2, viewGroup, false);
                        ((GalleryContentItemView) inflate).b = false;
                    } else {
                        inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_device_camera_item_view, viewGroup, false);
                    }
                } else {
                    inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_fullscreen_gallery_item_view, viewGroup, false);
                }
            } else {
                inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_camera_item_view_m2, viewGroup, false);
            }
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.g, viewGroup, false);
        }
        return new oo(inflate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapy
    public final void G(View view, int i) {
        super.G(view, i + this.f.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapy
    public final boolean H() {
        if (this.d.a() >= 3 && this.d.b(1) != 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aapy, defpackage.no
    public final int b() {
        return super.b() + this.f.h();
    }

    @Override // defpackage.aapy, defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        ahjj ahjjVar;
        oo e = super.e(viewGroup, i);
        if (i == 0 && (ahjjVar = this.h) != null) {
            View view = e.a;
            aasy aasyVar = (aasy) ahjjVar.a;
            if (!aasyVar.p.b() && aasyVar.E()) {
                aasyVar.n.ifPresent(new aakw(view, 20));
            }
            this.e = e.a;
        }
        return e;
    }

    @Override // defpackage.aapy, defpackage.zpm, defpackage.no
    public final void g(oo ooVar, int i) {
        int i2 = ooVar.f;
        if (i2 != 3 && i2 != 12) {
            if (i2 != 8 && i2 != 2) {
                super.g(ooVar, i - this.f.h());
                return;
            } else {
                ((aaqi) ooVar.a).b(new aaqf(this.d, i));
                ooVar.a.setClipToOutline(true);
                return;
            }
        }
        KeyEvent.Callback callback = ooVar.a;
        if (callback instanceof aaqi) {
            ((aaqi) callback).b(new aaqf(this.d, i));
        }
        G(ooVar.a, i);
    }

    @Override // defpackage.aapy
    protected final int m() {
        return R.string.c2o_category_gallery_content_description;
    }
}
