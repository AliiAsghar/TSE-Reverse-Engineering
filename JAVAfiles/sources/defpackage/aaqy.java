package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqy extends no {
    public final CustomizationModel c;
    public final qx d;
    private final Context e;
    private final float f;
    private final float g;
    private final Map h;
    private final Map i;

    public aaqy(Context context, CustomizationModel customizationModel) {
        EnumMap enumMap = new EnumMap(apel.class);
        this.h = enumMap;
        EnumMap enumMap2 = new EnumMap(apel.class);
        this.i = enumMap2;
        this.e = context;
        this.c = customizationModel;
        this.f = context.getResources().getFraction(R.fraction.c2o_customization_category_disabled_alpha, 1, 1);
        this.g = context.getResources().getFraction(R.fraction.c2o_customization_category_enabled_alpha, 1, 1);
        this.d = new qx(new aaqv(this));
        enumMap.put((EnumMap) apel.EMOJI, (apel) Integer.valueOf(R.drawable.ic_insert_emoticon_white));
        apel apelVar = apel.STICKER;
        Integer valueOf = Integer.valueOf(R.drawable.ic_insert_sticker_white);
        enumMap.put((EnumMap) apelVar, (apel) valueOf);
        enumMap.put((EnumMap) apel.GALLERY, (apel) Integer.valueOf(R.drawable.ic_insert_photo_white));
        enumMap.put((EnumMap) apel.LOCATION, (apel) Integer.valueOf(R.drawable.quantum_gm_ic_location_on_white_24));
        enumMap.put((EnumMap) apel.GIF, (apel) Integer.valueOf(R.drawable.ic_insert_gif_white));
        enumMap.put((EnumMap) apel.EXPRESSIVE_STICKER, (apel) valueOf);
        enumMap.put((EnumMap) apel.CONTACT, (apel) Integer.valueOf(R.drawable.quantum_gm_ic_person_white_24));
        enumMap.put((EnumMap) apel.FILE, (apel) Integer.valueOf(R.drawable.quantum_ic_attachment_white_24));
        enumMap2.put((EnumMap) apel.EMOJI, (apel) Integer.valueOf(R.string.c2o_category_name_emojis));
        apel apelVar2 = apel.STICKER;
        Integer valueOf2 = Integer.valueOf(R.string.c2o_category_name_stickers);
        enumMap2.put((EnumMap) apelVar2, (apel) valueOf2);
        enumMap2.put((EnumMap) apel.GALLERY, (apel) Integer.valueOf(R.string.c2o_category_name_gallery));
        enumMap2.put((EnumMap) apel.LOCATION, (apel) Integer.valueOf(R.string.c2o_category_name_location));
        enumMap2.put((EnumMap) apel.GIF, (apel) Integer.valueOf(R.string.c2o_category_name_gif));
        enumMap2.put((EnumMap) apel.EXPRESSIVE_STICKER, (apel) valueOf2);
        enumMap2.put((EnumMap) apel.CONTACT, (apel) Integer.valueOf(R.string.c2o_category_name_contact));
        enumMap2.put((EnumMap) apel.FILE, (apel) Integer.valueOf(R.string.c2o_contact_share_file_text));
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.a() - 1;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new aaqx(this, LayoutInflater.from(this.e).inflate(R.layout.compose2o_customization_draggable_item_view, viewGroup, false));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        int i2;
        aaqx aaqxVar = (aaqx) ooVar;
        apem b = this.c.b(i);
        boolean z = true;
        int i3 = 0;
        if (b.d) {
            aaqxVar.a.setOnTouchListener(aaqxVar);
            aaqxVar.u.setAlpha(this.g);
            aaqxVar.t.setAlpha(this.g);
            aaqxVar.s.setAlpha(this.g);
            aaqxVar.v.setEnabled(true);
            aaqxVar.v.setOnCheckedChangeListener(new aaqw(this, i, 0));
        } else {
            aaqxVar.a.setOnTouchListener(null);
            aaqxVar.u.setAlpha(this.f);
            aaqxVar.t.setAlpha(this.f);
            aaqxVar.s.setAlpha(this.f);
            aaqxVar.v.setEnabled(false);
            aaqxVar.v.setOnCheckedChangeListener(null);
        }
        TextView textView = aaqxVar.u;
        apel b2 = apel.b(b.b);
        if (b2 == null) {
            b2 = apel.UNRECOGNIZED;
        }
        if (this.i.containsKey(b2)) {
            i2 = ((Integer) this.i.get(b2)).intValue();
        } else {
            i2 = 0;
        }
        textView.setText(i2);
        Switch r7 = aaqxVar.v;
        apen b3 = apen.b(b.c);
        if (b3 == null) {
            b3 = apen.UNRECOGNIZED;
        }
        if (b3 != apen.VISIBLE) {
            z = false;
        }
        r7.setChecked(z);
        ImageView imageView = aaqxVar.t;
        apel b4 = apel.b(b.b);
        if (b4 == null) {
            b4 = apel.UNRECOGNIZED;
        }
        if (this.h.containsKey(b4)) {
            i3 = ((Integer) this.h.get(b4)).intValue();
        }
        imageView.setImageResource(i3);
    }
}
