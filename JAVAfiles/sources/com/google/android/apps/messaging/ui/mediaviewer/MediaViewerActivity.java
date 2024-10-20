package com.google.android.apps.messaging.ui.mediaviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.a;
import defpackage.aawl;
import defpackage.aawv;
import defpackage.aaww;
import defpackage.aawx;
import defpackage.aawz;
import defpackage.aaxa;
import defpackage.akec;
import defpackage.akkg;
import defpackage.akkh;
import defpackage.aklg;
import defpackage.aklh;
import defpackage.aklr;
import defpackage.akpr;
import defpackage.akqj;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.akto;
import defpackage.aktp;
import defpackage.alog;
import defpackage.apxb;
import defpackage.apxh;
import defpackage.bd;
import defpackage.enh;
import defpackage.eno;
import defpackage.hht;
import defpackage.kqj;
import defpackage.ruy;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaViewerActivity extends aawl implements akkh, akkg, aklg {
    private aaww n;
    private boolean p;
    private Context q;
    private eno s;
    private boolean x;
    private final akpr o = new akpr(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final void D() {
        if (this.n == null) {
            if (this.p) {
                if (this.x && !isFinishing()) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                akrh e = aktp.e("CreateComponent");
                try {
                    aS();
                    e.close();
                    e = aktp.e("CreatePeer");
                    try {
                        try {
                            Object aS = aS();
                            Activity activity = (Activity) ((kqj) aS).c.b();
                            if (activity instanceof MediaViewerActivity) {
                                MediaViewerActivity mediaViewerActivity = (MediaViewerActivity) activity;
                                mediaViewerActivity.getClass();
                                this.n = new aaww(mediaViewerActivity, ((kqj) aS).b.a.gc);
                                e.close();
                                this.n.g = this;
                                return;
                            }
                            throw new IllegalStateException(hht.d(activity, aaww.class, "Attempt to inject a Activity wrapper of type "));
                        } catch (ClassCastException e2) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } finally {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
    }

    @Override // defpackage.akkg
    public final long A() {
        return this.r;
    }

    @Override // defpackage.zgw
    public final /* synthetic */ apxb B() {
        return new aklr(this);
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aaww.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        aaww aawwVar = this.n;
        if (aawwVar != null) {
            if (!this.x) {
                return aawwVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.zgr
    protected final boolean F() {
        return false;
    }

    @Override // defpackage.dx, defpackage.enm
    public final enh N() {
        if (this.s == null) {
            this.s = new aklh(this);
        }
        return this.s;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.q;
        }
        aktp.E(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.q = context;
        aktp.D(context);
        super.attachBaseContext(context);
        this.q = null;
    }

    @Override // defpackage.aitz, android.app.Activity
    public final void finish() {
        aksa a = this.o.a();
        try {
            super.finish();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ex, android.app.Activity
    public final void invalidateOptionsMenu() {
        aksa k = akqj.k();
        try {
            super.invalidateOptionsMenu();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ex
    public final boolean n() {
        aksa j = this.o.j();
        try {
            boolean n = super.n();
            j.close();
            return n;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.cj, defpackage.re, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        aksa q = this.o.q();
        try {
            super.onActivityResult(i, i2, intent);
            q.close();
        } catch (Throwable th) {
            try {
                q.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, defpackage.re, android.app.Activity
    public final void onBackPressed() {
        aksa b = this.o.b();
        try {
            super.onBackPressed();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, defpackage.ex, defpackage.re, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        aksa r = this.o.r();
        try {
            super.onConfigurationChanged(configuration);
            r.close();
        } catch (Throwable th) {
            try {
                r.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r14v4, types: [akln, java.lang.Object] */
    @Override // defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aksa aksaVar;
        aaww aawwVar;
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        boolean z2;
        boolean z3;
        aksa s = this.o.s();
        try {
            this.p = true;
            D();
            aksaVar = s;
            try {
                ((aklh) N()).h(this.o);
                aS().K().g();
                super.onCreate(bundle);
                D();
                aawwVar = this.n;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            aksaVar = s;
        }
        try {
            aawwVar.a.setContentView(R.layout.media_viewer_activity);
            ConversationIdType conversationIdType = ruy.a;
            aawz e = MediaViewerButton.e();
            e.b(R.string.media_viewer_save_media_description);
            e.d(R.drawable.quantum_ic_save_alt_white_24);
            e.c(new MediaViewerSaveButtonEvent());
            MediaViewerButton a = e.a();
            aawz e2 = MediaViewerButton.e();
            e2.b(R.string.media_viewer_share_media_description);
            e2.d(R.drawable.quantum_gm_ic_share_white_24);
            e2.c(new MediaViewerShareButtonEvent());
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(alog.s(a, e2.a()));
            aawz e3 = MediaViewerButton.e();
            e3.c(new MediaViewerCloseButtonEvent());
            MediaViewerButton a2 = e3.a();
            int ae = a.ae(aawwVar.a.getIntent().getIntExtra("opening_source", 0));
            int i = ae - 1;
            if (ae != 0) {
                Uri uri = (Uri) aawwVar.a.getIntent().getParcelableExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                if (uri == null) {
                    uri = null;
                }
                MediaViewerButton mediaViewerButton = (MediaViewerButton) aawwVar.a.getIntent().getParcelableExtra("primary_button");
                if (mediaViewerButton == null) {
                    mediaViewerButton = null;
                }
                boolean booleanExtra = aawwVar.a.getIntent().getBooleanExtra("open_in_editor", false);
                int intExtra = aawwVar.a.getIntent().getIntExtra("media_editor_type", 1);
                ArrayList<? extends Parcelable> parcelableArrayListExtra = aawwVar.a.getIntent().getParcelableArrayListExtra("secondary_button_list");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = arrayList;
                }
                Uri uri2 = (Uri) aawwVar.a.getIntent().getParcelableExtra("photos");
                if (uri2 == null) {
                    uri2 = null;
                }
                String stringExtra = aawwVar.a.getIntent().getStringExtra("content_type");
                if (stringExtra == null) {
                    stringExtra = null;
                }
                boolean booleanExtra2 = aawwVar.a.getIntent().getBooleanExtra("show_direct_send_viewer", false);
                aawwVar.e = booleanExtra2;
                ArrayList<? extends Parcelable> arrayList2 = parcelableArrayListExtra;
                if (booleanExtra2) {
                    str2 = "secondary_button_list";
                    aawwVar.a.getWindow().setSoftInputMode(16);
                    aawwVar.a.setRequestedOrientation(1);
                    boolean booleanExtra3 = aawwVar.a.getIntent().getBooleanExtra("show_direct_send_button", false);
                    aawwVar.f = booleanExtra3;
                    boolean z4 = aawwVar.e;
                    str4 = aawwVar.a.getIntent().getStringExtra("text_caption");
                    str = "text_caption";
                    boolean booleanExtra4 = aawwVar.a.getIntent().getBooleanExtra("use_encrypted_icon", false);
                    if (str4 == null) {
                        str4 = null;
                    }
                    z3 = booleanExtra4;
                    z = booleanExtra3;
                    z2 = z4;
                    str3 = "use_encrypted_icon";
                } else {
                    str = "text_caption";
                    str2 = "secondary_button_list";
                    str3 = "use_encrypted_icon";
                    z = false;
                    str4 = null;
                    z2 = false;
                    z3 = false;
                }
                ArrayList<? extends Parcelable> parcelableArrayListExtra2 = aawwVar.a.getIntent().getParcelableArrayListExtra("media_viewer_items");
                int intExtra2 = aawwVar.a.getIntent().getIntExtra("media_viewer_position", 0);
                boolean z5 = z;
                long longExtra = aawwVar.a.getIntent().getLongExtra("video_start_ts", 0L);
                boolean booleanExtra5 = aawwVar.a.getIntent().getBooleanExtra("start_playing_video", false);
                aaxa aaxaVar = new aaxa();
                apxh.e(aaxaVar);
                Bundle bundle2 = new Bundle();
                bundle2.putString("conversation_id", conversationIdType.a());
                bundle2.putString("participant_look_up_id", null);
                bundle2.putInt("media_viewer_position", intExtra2);
                bundle2.putBoolean("has_star_filter", false);
                bundle2.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
                bundle2.putParcelable("photos", uri2);
                bundle2.putString("content_type", stringExtra);
                bundle2.putString("media_viewer_title", null);
                bundle2.putString("media_viewer_subtitle", null);
                bundle2.putParcelable("primary_button", mediaViewerButton);
                bundle2.putParcelableArrayList(str2, arrayList2);
                bundle2.putParcelable("close_button", a2);
                bundle2.putInt("opening_source", i);
                bundle2.putInt("media_editor_type", intExtra);
                bundle2.putBoolean("open_in_editor", booleanExtra);
                bundle2.putBoolean("show_direct_send_viewer", z2);
                bundle2.putBoolean("show_direct_send_button", z5);
                bundle2.putString(str, str4);
                bundle2.putBoolean(str3, z3);
                if (parcelableArrayListExtra2 != null) {
                    bundle2.putParcelableArrayList("media_viewer_items", parcelableArrayListExtra2);
                }
                bundle2.putLong("video_start_ts", longExtra);
                bundle2.putBoolean("start_playing_video", booleanExtra5);
                aaxaVar.ak(bundle2);
                aawwVar.c = aaxaVar;
                bd bdVar = new bd(aawwVar.a.a());
                bdVar.q(R.id.activity_media_viewer_container, aawwVar.c);
                bdVar.b();
                aawwVar.d = new aawv(aawwVar);
                aawwVar.a.c().b(aawwVar.a, aawwVar.d);
                aktp.bG(this).a = findViewById(android.R.id.content);
                aaww aawwVar2 = this.n;
                aktp.F(this, MediaViewerPrimaryButtonEvent.class, new aawx(aawwVar2, 1));
                aktp.F(this, MediaViewerAddMoreButtonEvent.class, new aawx(aawwVar2, 0));
                this.p = false;
                this.o.l();
                aksaVar.close();
                return;
            }
            throw null;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            try {
                aksaVar.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // defpackage.re, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        aksa t = this.o.t();
        try {
            super.onCreatePanelMenu(i, menu);
            t.close();
            return true;
        } catch (Throwable th) {
            try {
                t.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zgw, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onDestroy() {
        aksa c = this.o.c();
        try {
            super.onDestroy();
            this.x = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.re, android.app.Activity
    public final void onNewIntent(Intent intent) {
        aksa d = this.o.d(intent);
        try {
            super.onNewIntent(intent);
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        aksa v = this.o.v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            v.close();
            return onOptionsItemSelected;
        } catch (Throwable th) {
            try {
                v.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onPause() {
        aksa e = this.o.e();
        try {
            super.onPause();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.re, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        aksa w = this.o.w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            w.close();
        } catch (Throwable th) {
            try {
                w.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        aksa x = this.o.x();
        try {
            super.onPostCreate(bundle);
            x.close();
        } catch (Throwable th) {
            try {
                x.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onPostResume() {
        aksa f = this.o.f();
        try {
            super.onPostResume();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        aksa k = akqj.k();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            k.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, defpackage.re, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        aksa y = this.o.y();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            y.close();
        } catch (Throwable th) {
            try {
                y.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onResume() {
        aksa g = this.o.g();
        try {
            super.onResume();
            g.close();
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.re, defpackage.dx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        aksa z = this.o.z();
        try {
            super.onSaveInstanceState(bundle);
            z.close();
        } catch (Throwable th) {
            try {
                z.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStart() {
        aksa h = this.o.h();
        try {
            super.onStart();
            h.close();
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStop() {
        aksa i = this.o.i();
        try {
            super.onStop();
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity
    public final void onUserInteraction() {
        aksa k = this.o.k();
        try {
            super.onUserInteraction();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.aitz, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex
    public final void gN() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex
    public final void gO() {
    }
}
