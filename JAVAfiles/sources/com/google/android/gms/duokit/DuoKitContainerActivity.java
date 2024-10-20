package com.google.android.gms.duokit;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.abhx;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DuoKitContainerActivity extends Activity {
    public static void a(Context context, boolean z, ArrayList arrayList) {
        String str;
        if (true != z) {
            str = "com.google.android.gms.duokit.action.LAUNCH_DUO";
        } else {
            str = "com.google.android.gms.duokit.action.REGISTER_DUO";
        }
        Intent addFlags = new Intent(str).setClassName(context, DuoKitContainerActivity.class.getName()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (!arrayList.isEmpty()) {
            addFlags.putStringArrayListExtra("com.google.android.apps.tachyon.extra.CALLEES", arrayList);
        }
        context.startActivity(addFlags);
    }

    private final void b() {
        String format;
        if (getIntent().hasExtra("com.google.android.apps.tachyon.extra.REFERRER")) {
            format = String.format("%s-%s-%s", "duokit", getPackageName(), getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER"));
        } else {
            format = String.format("%s-%s", "duokit", getPackageName());
        }
        try {
            startActivityForResult(new Intent("android.intent.action.VIEW").setData(Uri.parse(String.format("market://details?id=%s&allow_update=1&referrer=%s", "com.google.android.apps.tachyon", format))).putExtra("overlay", true).putExtra("callerId", getPackageName()).putExtra("referrer", format).putExtra("allow_update", true).setPackage("com.android.vending"), 0);
        } catch (ActivityNotFoundException e) {
            Log.w("DuoKitContainerActivity", "Cannot launch AlleyOop activity", e);
            abhx.b(this);
        }
        finish();
    }

    private final void c() {
        d(new Intent("android.intent.action.MAIN").setPackage("com.google.android.apps.tachyon"));
    }

    private final void d(Intent intent) {
        e(intent, 0);
    }

    private final void e(Intent intent, int i) {
        intent.putExtra("com.google.android.gms.duokit.extra.DUOKIT_VERSION", "0.0.1");
        if (getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER") != null) {
            intent.putExtra("com.google.android.apps.tachyon.extra.REFERRER", getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER"));
        }
        try {
            startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("DuoKitContainerActivity", "No activity found to handle intent", e);
            Toast.makeText(this, R.string.no_activity_found_error, 0).show();
        }
        if (i == 0) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (Log.isLoggable("DuoKitContainerActivity", 4)) {
            Log.i("DuoKitContainerActivity", a.bU(i2, i, "onActivityResult with requestCode: ", ", resultCode: "));
        }
        if (i == 100) {
            if (i2 == 0) {
                Log.w("DuoKitContainerActivity", "Start group request failed, try to launch Duo");
                c();
            } else {
                finish();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            Log.e("DuoKitContainerActivity", "null action");
            finish();
            return;
        }
        switch (action.hashCode()) {
            case -1769882372:
                if (action.equals("com.google.android.gms.duokit.action.LAUNCH_DUO")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1611836229:
                if (action.equals("com.google.android.gms.duokit.action.INSTALL_DUO_VIA_ALLEYOOP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -704052074:
                if (action.equals("com.google.android.gms.duokit.action.DUO_START_GROUP_FLOW")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 179439980:
                if (action.equals("com.google.android.gms.duokit.action.REGISTER_DUO")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1616149577:
                if (action.equals("com.google.android.gms.duokit.action.DUO_CALL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            Log.e("DuoKitContainerActivity", "Container activity called without an action! Not launching any activity.");
                            finish();
                            return;
                        } else {
                            e(new Intent("com.google.android.apps.tachyon.action.CALL_GROUP_MEMBERS").setPackage("com.google.android.apps.tachyon").putStringArrayListExtra("members", getIntent().getStringArrayListExtra("members")), 100);
                            return;
                        }
                    }
                    d(new Intent("com.google.android.apps.tachyon.action.CALL").setPackage("com.google.android.apps.tachyon").setData(getIntent().getData()).putExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", getIntent().getBooleanExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", false)));
                    return;
                }
                Intent intent = new Intent("com.google.android.apps.tachyon.action.REGISTER").setPackage("com.google.android.apps.tachyon");
                if (getIntent().hasExtra("com.google.android.apps.tachyon.extra.CALLEES")) {
                    intent.putExtra("com.google.android.apps.tachyon.extra.CALLEES", getIntent().getStringArrayListExtra("com.google.android.apps.tachyon.extra.CALLEES"));
                }
                d(intent);
                return;
            }
            c();
            return;
        }
        b();
    }
}
