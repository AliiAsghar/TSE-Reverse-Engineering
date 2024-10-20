package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxk implements mxh {
    private final String a;
    private final Uri b;
    private final aggp c;
    private final Duration d;
    private final mvy e;
    private final myz f;

    public mxk() {
        throw null;
    }

    @Override // defpackage.mxh
    public final mvy a() {
        return this.e;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxh
    public final aggp c() {
        return this.c;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.mxh
    public final Duration e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        myz myzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxk) {
            mxk mxkVar = (mxk) obj;
            if (this.a.equals(mxkVar.a) && this.b.equals(mxkVar.b) && this.c.equals(mxkVar.c) && this.d.equals(mxkVar.d) && ((myzVar = this.f) != null ? myzVar.equals(mxkVar.f) : mxkVar.f == null)) {
                if (this.e == null) {
                    if (mxkVar.e == null) {
                        return true;
                    }
                } else {
                    mvy mvyVar = mxkVar.e;
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        myz myzVar = this.f;
        if (myzVar == null) {
            hashCode = 0;
        } else {
            hashCode = myzVar.hashCode();
        }
        int i = ((hashCode2 * (-721379959)) ^ hashCode) * 1000003;
        if (this.e == null) {
            return i;
        }
        throw null;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    public final String toString() {
        mvy mvyVar = this.e;
        myz myzVar = this.f;
        Duration duration = this.d;
        aggp aggpVar = this.c;
        return "BugleAudioContent{contentType=" + this.a + ", uri=" + String.valueOf(this.b) + ", voiceMetadata=" + String.valueOf(aggpVar) + ", duration=" + String.valueOf(duration) + ", originalUri=null, progress=" + String.valueOf(myzVar) + ", voiceTranscription=" + String.valueOf(mvyVar) + "}";
    }

    public mxk(String str, Uri uri, aggp aggpVar, Duration duration, myz myzVar, mvy mvyVar) {
        this.a = str;
        this.b = uri;
        this.c = aggpVar;
        this.d = duration;
        this.f = myzVar;
        this.e = mvyVar;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
