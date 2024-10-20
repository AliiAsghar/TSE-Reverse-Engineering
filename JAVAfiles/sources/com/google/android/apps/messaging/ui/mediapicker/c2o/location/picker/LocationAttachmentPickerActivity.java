package com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.aajt;
import defpackage.aarv;
import defpackage.aauc;
import defpackage.aaud;
import defpackage.aaue;
import defpackage.aaug;
import defpackage.aauh;
import defpackage.abbl;
import defpackage.abbu;
import defpackage.abhg;
import defpackage.absq;
import defpackage.acef;
import defpackage.aceg;
import defpackage.aceh;
import defpackage.acei;
import defpackage.acej;
import defpackage.aceo;
import defpackage.acep;
import defpackage.aceq;
import defpackage.acew;
import defpackage.acex;
import defpackage.acez;
import defpackage.acfa;
import defpackage.acfc;
import defpackage.ahjj;
import defpackage.ahnz;
import defpackage.alvi;
import defpackage.amqf;
import defpackage.amqh;
import defpackage.bd;
import defpackage.brg;
import defpackage.d;
import defpackage.ivf;
import defpackage.lze;
import defpackage.mbl;
import defpackage.trz;
import defpackage.ttd;
import defpackage.uac;
import defpackage.uem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationAttachmentPickerActivity extends aauc implements aceq {
    public static final alvi H = alvi.m("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerActivity");
    public aaug I;
    public RecyclerView J;
    public View K;
    public View L;
    public View M;
    public MenuItem N;
    public TextView O;
    TextView P;
    TextView Q;
    ImageView R;
    View S;
    public mbl T;
    public aaue U;
    public trz V;
    public uac W;
    private ImageView Y;
    private TextView Z;
    private int aa;
    private aajt ab;

    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.android.gms.maps.internal.IUiSettingsDelegate, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.google.android.gms.maps.internal.IUiSettingsDelegate, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.maps.internal.IUiSettingsDelegate, java.lang.Object] */
    @Override // defpackage.aceq
    public final void A(acej acejVar) {
        aajt aajtVar = new aajt(acejVar);
        this.ab = aajtVar;
        Object obj = aajtVar.a;
        try {
            if (this.U == null) {
                ((acej) obj).a.setLocationSource(null);
            } else {
                ((acej) obj).a.setLocationSource(new aceh());
            }
            try {
                ((acej) this.ab.a).a().a.setCompassEnabled(false);
                try {
                    ((acej) this.ab.a).a().a.setRotateGesturesEnabled(false);
                    try {
                        ((acej) this.ab.a).a().a.setMyLocationButtonEnabled(false);
                        try {
                            ((acej) this.ab.a).a.setOnMapClickListener(new acei(new ahjj(this)));
                            try {
                                ((acej) this.ab.a).a.setOnMarkerDragListener(new aceg(new ahjj(this, (byte[]) null)));
                                try {
                                    ((acej) this.ab.a).a.setOnMarkerClickListener(new acef());
                                    this.U.g();
                                    L(amqf.LOADED);
                                } catch (RemoteException e) {
                                    throw new acfc(e);
                                }
                            } catch (RemoteException e2) {
                                throw new acfc(e2);
                            }
                        } catch (RemoteException e3) {
                            throw new acfc(e3);
                        }
                    } catch (RemoteException e4) {
                        throw new acfc(e4);
                    }
                } catch (RemoteException e5) {
                    throw new acfc(e5);
                }
            } catch (RemoteException e6) {
                throw new acfc(e6);
            }
        } catch (RemoteException e7) {
            throw new acfc(e7);
        }
    }

    public final void C() {
        MenuItem menuItem = this.N;
        if (menuItem != null) {
            menuItem.setVisible(false);
            this.N.setEnabled(false);
        }
        this.K.setVisibility(0);
        this.M.setVisibility(8);
        this.J.setVisibility(8);
    }

    public final void E() {
        aaug aaugVar = this.I;
        if (aaugVar.d != 1) {
            aaugVar.d = 1;
            aaugVar.p();
        }
    }

    @Override // defpackage.aapj
    protected final amqh I() {
        return amqh.LOCATION;
    }

    @Override // defpackage.aapj
    protected final Class J() {
        return LocationContentItem.class;
    }

    public final void aa(LatLng latLng) {
        if (this.ab != null) {
            acez acezVar = new acez();
            acezVar.b(latLng);
            acezVar.a = 17.0f;
            acezVar.c = brg.a;
            acezVar.b = brg.a;
            CameraPosition a = acezVar.a();
            Object obj = this.ab.a;
            try {
                ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = acex.b;
                d.aC(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                IObjectWrapper newCameraPosition = iCameraUpdateFactoryDelegate.newCameraPosition(a);
                abhg.m(newCameraPosition);
                try {
                    ((acej) obj).a.moveCamera(newCameraPosition);
                } catch (RemoteException e) {
                    throw new acfc(e);
                }
            } catch (RemoteException e2) {
                throw new acfc(e2);
            }
        }
    }

    public final void ab(LatLng latLng) {
        aajt aajtVar = this.ab;
        if (aajtVar != null) {
            try {
                ((acej) aajtVar.a).a.clear();
                MarkerOptions markerOptions = new MarkerOptions();
                if (latLng != null) {
                    markerOptions.a = latLng;
                    markerOptions.b = getString(R.string.location_attachment_picker_marker_title);
                    try {
                        IMarkerDelegate addMarker = ((acej) this.ab.a).a.addMarker(markerOptions);
                        if (addMarker != null) {
                            if (markerOptions.o == 1) {
                                new acfa(addMarker);
                                return;
                            } else {
                                new acfa(addMarker);
                                return;
                            }
                        }
                        return;
                    } catch (RemoteException e) {
                        throw new acfc(e);
                    }
                }
                throw new IllegalArgumentException("latlng cannot be null - a position is required.");
            } catch (RemoteException e2) {
                throw new acfc(e2);
            }
        }
    }

    public final void ac(uem uemVar, boolean z) {
        String string;
        this.O.setText(R.string.location_attachment_picker_send_location);
        abbu.j(this.Q, uemVar.d());
        abbu.j(this.P, uemVar.c());
        int f = ahnz.f(this, R.attr.colorOnSurfaceVariant, "LocationAttachmentPickerActivity");
        this.Y.setImageResource(R.drawable.quantum_gm_ic_location_on_grey600_24);
        this.Y.setImageTintList(ColorStateList.valueOf(f));
        int i = this.aa;
        ArrayList arrayList = new ArrayList();
        CharSequence d = uemVar.d();
        if (!TextUtils.isEmpty(d)) {
            arrayList.add(d);
        }
        CharSequence c = uemVar.c();
        if (!TextUtils.isEmpty(c)) {
            arrayList.add(c);
        }
        String join = TextUtils.join(" ", arrayList);
        View view = this.S;
        if (i != 10) {
            if (i != 20) {
                uac uacVar = this.W;
                string = getString(R.string.location_attachment_picker_send_content_description, new Object[]{join});
                if (i == 40 && ttd.f()) {
                    string = ((Context) uacVar.a).getString(R.string.location_attachment_picker_send_encrypted_content_description, join);
                }
            } else {
                string = getString(R.string.location_attachment_picker_send_mms_content_description, new Object[]{join});
            }
        } else {
            string = getString(R.string.location_attachment_picker_send_sms_content_description, new Object[]{join});
        }
        view.setContentDescription(string);
        if (z) {
            this.S.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapj, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        Drawable c;
        super.onCreate(bundle);
        this.aa = getIntent().getIntExtra("message_type", -1);
        setContentView(R.layout.location_attachment_picker_activity_m2_nearby_hidden);
        aaug aaugVar = new aaug(getApplicationContext(), this.U);
        new aauh(this.U);
        this.U.d = new WeakReference(this);
        this.I = aaugVar;
        int i = this.aa;
        this.M = findViewById(R.id.main_container);
        this.O = (TextView) findViewById(R.id.select_location_bar_label);
        this.P = (TextView) findViewById(R.id.select_location_bar_subtitle);
        this.Q = (TextView) findViewById(R.id.select_location_bar_title);
        this.R = (ImageView) findViewById(R.id.my_location_button);
        this.S = findViewById(R.id.select_location_bar_container);
        this.Y = (ImageView) findViewById(R.id.select_location_bar_info_icon);
        TextView textView = (TextView) findViewById(R.id.select_location_bar_send_text);
        this.Z = textView;
        if (i != 10 && i != 11) {
            if (i != 20) {
                string = "";
            } else {
                string = getString(R.string.mms_text);
            }
        } else {
            string = getString(R.string.sms_text);
        }
        abbu.j(textView, string);
        this.S.setOnClickListener(new aarv(this, 12));
        this.R.setOnClickListener(new aarv(this, 13));
        this.J = (RecyclerView) findViewById(R.id.search_results_list);
        this.K = findViewById(R.id.location_permissions_needed_container);
        this.L = findViewById(R.id.location_permissions_needed_button);
        if (this.V.q()) {
            ImageView imageView = (ImageView) findViewById(R.id.select_location_bar_send_icon);
            if (i == -2) {
                c = getDrawable(R.drawable.gs_done_vd_theme_24);
            } else {
                c = this.W.c(i);
            }
            imageView.setImageDrawable(c);
        }
        acew acewVar = new acew();
        bd bdVar = new bd(a());
        bdVar.q(R.id.map_container, acewVar);
        bdVar.j();
        acep.b(getApplicationContext(), aceo.LATEST, new absq(this, acewVar));
        View findViewById = findViewById(R.id.activity_location_browser);
        findViewById.setSystemUiVisibility(1792);
        findViewById.setOnApplyWindowInsetsListener(new ivf(14));
        this.M.setOnApplyWindowInsetsListener(new abbl(new lze(3)));
        c().b(this, new aaud(this));
    }

    @Override // defpackage.zgu, defpackage.aitz, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.location_attachment_picker_menu_m2, menu);
        MenuItem findItem = menu.findItem(R.id.location_attachment_picker_menu_search);
        this.N = findItem;
        findItem.setVisible(false);
        return true;
    }

    @Override // defpackage.zgw, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        aaue aaueVar = this.U;
        aaueVar.b.b(aaueVar);
    }

    @Override // defpackage.zgu, defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onPause() {
        super.onPause();
        aaue aaueVar = this.U;
        aaueVar.b.b(aaueVar);
    }

    @Override // defpackage.zgu, defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.U.g();
    }
}
