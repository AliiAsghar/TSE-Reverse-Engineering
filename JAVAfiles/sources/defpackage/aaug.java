package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaug extends no {
    private final aaue e;
    private final akms f;
    public int d = 2;
    public final List c = new ArrayList();

    public aaug(Context context, aaue aaueVar) {
        this.f = aktp.x(context.getApplicationContext()).b().b(hxc.e());
        this.e = aaueVar;
    }

    @Override // defpackage.no
    public final int b() {
        int i = this.d;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return 2;
            }
            if (i2 == 2) {
                return 1;
            }
            return this.c.size() + 1;
        }
        throw null;
    }

    @Override // defpackage.no
    public final int c(int i) {
        int i2;
        int i3 = this.d;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 != 0) {
                i2 = 2;
                if (i4 == 2) {
                    return 4;
                }
            } else {
                i2 = 3;
            }
            if (i == 0) {
                return 1;
            }
            return i2;
        }
        throw null;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return new aauf(from.inflate(R.layout.location_attachment_picker_nearby_places_error_m2, viewGroup, false));
                }
                return new aauf(from.inflate(R.layout.location_attachment_picker_progress_bar, viewGroup, false));
            }
            return new aauf(from.inflate(R.layout.location_attachment_picker_nearby_list_item_m2, viewGroup, false));
        }
        return new aauf(from.inflate(R.layout.location_attachment_picker_nearby_list_header_m2, viewGroup, false));
    }

    @Override // defpackage.no
    public final /* synthetic */ void g(oo ooVar, int i) {
        int i2;
        aauf aaufVar = (aauf) ooVar;
        if (c(i) == 2 && i - 1 >= 0) {
            uem uemVar = (uem) this.c.get(i2);
            aaue aaueVar = this.e;
            akms akmsVar = this.f;
            ((TextView) aaufVar.s).setText(uemVar.b());
            ((TextView) aaufVar.t).setText(uemVar.a());
            ((TextView) aaufVar.u).setText(aaufVar.a.getContext().getString(R.string.location_attachment_picker_nearby_distance, 0));
            aaufVar.a.setOnClickListener(new zoz(aaueVar, uemVar, 15));
            ((ImageView) aaufVar.v).setImageResource(R.drawable.location_attachment_picker_nearby_icon_default_m2);
            if (uemVar.d) {
                Bitmap bitmap = uemVar.c;
                if (bitmap != null) {
                    akmsVar.al(bitmap).b(hxc.b()).t((ImageView) aaufVar.v);
                    return;
                }
                return;
            }
            uemVar.d = true;
            int dimensionPixelSize = aaufVar.a.getResources().getDimensionPixelSize(R.dimen.location_attachment_picker_nearby_image_size);
            String ag = albo.ag(uemVar.b.q);
            lek lekVar = aaueVar.c;
            synchronized (lekVar.d) {
                lekVar.j.add(new leh(lekVar, ag, dimensionPixelSize, dimensionPixelSize, i));
            }
        }
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return i;
    }
}
