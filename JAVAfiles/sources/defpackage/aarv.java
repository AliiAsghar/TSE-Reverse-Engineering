package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.hardware.Camera;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraGalleryStoragePermissionItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryCameraItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryDeviceCameraItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.PermissionContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifCategoryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import com.google.android.gms.maps.model.LatLng;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aarv implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aarv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [aaqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [aaqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21, types: [aaqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v34, types: [aaqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [aaqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [aaqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [aaqi, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String format;
        boolean z;
        int i;
        int i2 = 13;
        int i3 = 0;
        switch (this.b) {
            case 0:
                ?? r14 = this.a;
                aaqf aaqfVar = ((CameraGalleryStoragePermissionItemView) r14).a;
                if (aaqfVar != 0) {
                    aaqfVar.a(r14);
                    return;
                }
                return;
            case 1:
                ((aarq) this.a).a.c.r();
                return;
            case 2:
                ?? r142 = this.a;
                aaqf aaqfVar2 = ((FullscreenGalleryItemView) r142).a;
                if (aaqfVar2 != 0) {
                    aaqfVar2.a(r142);
                    return;
                }
                return;
            case 3:
                ?? r143 = this.a;
                aaqf aaqfVar3 = ((GalleryCameraItemView) r143).a;
                if (aaqfVar3 != 0) {
                    aaqfVar3.a(r143);
                    return;
                }
                return;
            case 4:
                ?? r144 = this.a;
                aaqf aaqfVar4 = ((GalleryDeviceCameraItemView) r144).a;
                if (aaqfVar4 != 0) {
                    aaqfVar4.a(r144);
                    return;
                }
                return;
            case 5:
                aaqf aaqfVar5 = ((GalleryDeviceCameraItemView) this.a).a;
                if (aaqfVar5 != null) {
                    aaqfVar5.a.g();
                    return;
                }
                return;
            case 6:
                ?? r145 = this.a;
                aaqf aaqfVar6 = ((PermissionContentItemView) r145).a;
                if (aaqfVar6 != 0) {
                    aaqfVar6.a(r145);
                    return;
                }
                return;
            case 7:
                aats aatsVar = (aats) this.a;
                aatsVar.h(false);
                aatsVar.n.setVisibility(8);
                return;
            case 8:
                aats aatsVar2 = (aats) this.a;
                aatsVar2.h(false);
                aatsVar2.n.setVisibility(8);
                return;
            case 9:
                ?? r146 = this.a;
                aaqf aaqfVar7 = ((GifCategoryContentItemView) r146).a;
                if (aaqfVar7 != 0) {
                    aaqfVar7.a(r146);
                    return;
                }
                return;
            case 10:
                ((LocationAttachmentPickerActivity) this.a).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return;
            case 11:
                ((LocationAttachmentPickerActivity) this.a).startActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"));
                return;
            case 12:
                aaue aaueVar = ((LocationAttachmentPickerActivity) this.a).U;
                if (aaueVar.f != null) {
                    LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) aaueVar.d.get();
                    int i4 = aaueVar.f.f;
                    aaueVar.g.c("Bugle.Share.LocationAttachmentPicker.CurrentLocationSent");
                    if (locationAttachmentPickerActivity != null) {
                        uem uemVar = aaueVar.f;
                        Intent intent = new Intent();
                        xze xzeVar = ryy.a;
                        int i5 = uemVar.e - 1;
                        if (i5 != 1) {
                            if (i5 == 2) {
                                aiba aibaVar = uemVar.b;
                                apnb apnbVar = null;
                                try {
                                    String str = aibaVar.q;
                                    str.getClass();
                                    apnb apnbVar2 = (apnb) apag.parseFrom(apnb.a, Base64.decode(str, 8), aozs.a());
                                    if (apnbVar2 != null && (apnbVar2.b & 1) != 0) {
                                        if (apnbVar2.d.isEmpty()) {
                                            apnbVar = apnbVar2;
                                        }
                                    }
                                } catch (apba unused) {
                                    ((alvg) ryy.a.i().h("com/google/android/apps/messaging/shared/datamodel/data/util/LocationUtils", "getPlaceId", 274, "LocationUtils.java")).t("Unable to parse place id: %s.", aibaVar.q);
                                }
                                if (apnbVar != null) {
                                    Locale locale = Locale.US;
                                    aonp aonpVar = apnbVar.c;
                                    if (aonpVar == null) {
                                        aonpVar = aonp.a;
                                    }
                                    String hexString = Long.toHexString(aonpVar.c);
                                    aonp aonpVar2 = apnbVar.c;
                                    if (aonpVar2 == null) {
                                        aonpVar2 = aonp.a;
                                    }
                                    format = String.format(locale, "https://www.google.com/maps/place/@/data=!4m2!3m1!1s0x%1s:0x%2s", hexString, Long.toHexString(aonpVar2.d));
                                }
                            }
                            format = "";
                        } else {
                            try {
                                CharSequence a = uemVar.a();
                                if (a != null) {
                                    format = String.format(Locale.US, "https://www.google.com/maps/search/?api=1&query=%s", URLEncoder.encode(a.toString().replace(",", " "), StandardCharsets.UTF_8.name()));
                                }
                            } catch (UnsupportedEncodingException e) {
                                ryy.a.r("Exception getting map website.", e);
                            }
                            format = "";
                        }
                        if (TextUtils.isEmpty(format)) {
                            LatLng latLng = uemVar.a;
                            format = vht.j(latLng.a, latLng.b);
                        }
                        intent.putExtra("location_url", format);
                        intent.setData(Uri.EMPTY);
                        Location location = new Location("Bugler");
                        location.setLatitude(uemVar.a.a);
                        location.setLongitude(uemVar.a.b);
                        intent.putExtra("location_extra", location);
                        int i6 = uemVar.f;
                        intent.putExtra("location_source_extra", ameb.LOCATION_CURRENT.a());
                        locationAttachmentPickerActivity.setResult(-1, intent);
                        locationAttachmentPickerActivity.finish();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((LocationAttachmentPickerActivity) this.a).U.e();
                return;
            case 14:
                ?? r147 = this.a;
                aaqf aaqfVar8 = ((SelectableContentItemView) r147).m;
                if (aaqfVar8 != 0) {
                    aaqfVar8.a(r147);
                    return;
                }
                return;
            case 15:
                Object obj = this.a;
                MiniCameraViewImpl miniCameraViewImpl = (MiniCameraViewImpl) obj;
                aava aavaVar = miniCameraViewImpl.d;
                if (aavaVar.e >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                xyl.k(z);
                if (aavaVar.d.facing != 1) {
                    i3 = 1;
                }
                int a2 = aava.a(i3);
                aavaVar.p();
                if (!aavaVar.o() && aavaVar.e != a2) {
                    aavaVar.r.set(true);
                    aavaVar.h();
                    aavaVar.e = a2;
                    Camera.getCameraInfo(a2, aavaVar.d);
                    qjb.a(new ebm(aavaVar, a2, i2), aavaVar.s);
                }
                if (!miniCameraViewImpl.w) {
                    miniCameraViewImpl.l.animate().rotationBy(-180.0f).setInterpolator(new emq()).withStartAction(new aaqk(obj, 12)).withEndAction(new aaqk(obj, 14));
                }
                View view2 = miniCameraViewImpl.l;
                Resources resources = miniCameraViewImpl.getResources();
                if (true != miniCameraViewImpl.d.n()) {
                    i = R.string.camera_front_switch_button;
                } else {
                    i = R.string.camera_back_switch_button;
                }
                view2.setContentDescription(resources.getString(i));
                return;
            case 16:
                boolean booleanValue = ((Boolean) aavm.ft.e()).booleanValue();
                Object obj2 = this.a;
                if (booleanValue) {
                    MiniCameraViewImpl miniCameraViewImpl2 = (MiniCameraViewImpl) obj2;
                    miniCameraViewImpl2.g(miniCameraViewImpl2.m);
                    return;
                } else {
                    ((MiniCameraViewImpl) obj2).D.q();
                    return;
                }
            case 17:
                boolean booleanValue2 = ((Boolean) aavm.ft.e()).booleanValue();
                Object obj3 = this.a;
                if (booleanValue2) {
                    MiniCameraViewImpl miniCameraViewImpl3 = (MiniCameraViewImpl) obj3;
                    miniCameraViewImpl3.g(miniCameraViewImpl3.p);
                    return;
                }
                MiniCameraViewImpl miniCameraViewImpl4 = (MiniCameraViewImpl) obj3;
                if (miniCameraViewImpl4.c.c()) {
                    miniCameraViewImpl4.D.q();
                    return;
                } else {
                    miniCameraViewImpl4.D.p(new aaqk(obj3, i2));
                    return;
                }
            case 18:
                Object obj4 = this.a;
                ((MiniCameraViewImpl) obj4).D.p(new aaqk(obj4, 15));
                return;
            case 19:
                ((aawt) this.a).a.a();
                return;
            default:
                ((aawt) this.a).a.a();
                return;
        }
    }
}
