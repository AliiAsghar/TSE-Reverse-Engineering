package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbw {
    public final Context a;
    public final fbx b;
    public final PlaybackSession c;
    public String g;
    public PlaybackMetrics.Builder h;
    public int i;
    public ern l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public apuv s;
    public apuv t;
    public apuv u;
    private eqn x;
    private eqn y;
    private eqn z;
    private final ery v = new ery();
    private final erx w = new erx();
    public final HashMap f = new HashMap();
    public final HashMap e = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int j = 0;
    public int k = 0;

    public fbw(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        fbv fbvVar = new fbv();
        this.b = fbvVar;
        fbvVar.c = this;
    }

    public static int a(int i) {
        switch (eul.j(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void i(int i, long j, eqn eqnVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        String str;
        timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.d);
        if (eqnVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = eqnVar.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = eqnVar.o;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = eqnVar.k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = eqnVar.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = eqnVar.v;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = eqnVar.w;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = eqnVar.D;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = eqnVar.E;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = eqnVar.d;
            if (str5 != null) {
                String[] ae = eul.ae(str5, "-");
                String str6 = ae[0];
                if (ae.length >= 2) {
                    str = ae[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = eqnVar.x;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.r = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.h;
        if (builder != null && this.r) {
            builder.setAudioUnderrunCount(this.q);
            this.h.setVideoFramesDropped(this.o);
            this.h.setVideoFramesPlayed(this.p);
            Long l = (Long) this.e.get(this.g);
            PlaybackMetrics.Builder builder2 = this.h;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.f.get(this.g);
            PlaybackMetrics.Builder builder3 = this.h;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.h;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            PlaybackSession playbackSession = this.c;
            build = this.h.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.h = null;
        this.g = null;
        this.q = 0;
        this.o = 0;
        this.p = 0;
        this.x = null;
        this.y = null;
        this.z = null;
        this.r = false;
    }

    public final void c(erz erzVar, fgv fgvVar) {
        int a;
        int i;
        PlaybackMetrics.Builder builder = this.h;
        if (fgvVar != null && (a = erzVar.a(fgvVar.a)) != -1) {
            erzVar.n(a, this.w);
            erzVar.p(this.w.c, this.v);
            erb erbVar = this.v.d.b;
            int i2 = 2;
            if (erbVar == null) {
                i = 0;
            } else {
                int o = eul.o(erbVar.a, erbVar.b);
                if (o != 0) {
                    if (o != 1) {
                        if (o != 2) {
                            i = 1;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 5;
                    }
                } else {
                    i = 3;
                }
            }
            builder.setStreamType(i);
            ery eryVar = this.v;
            if (eryVar.m != -9223372036854775807L && !eryVar.k && !eryVar.i && !eryVar.c()) {
                builder.setMediaDurationMillis(eryVar.b());
            }
            if (true != this.v.c()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.r = true;
        }
    }

    public final void d(long j, eqn eqnVar) {
        int i;
        if (Objects.equals(this.y, eqnVar)) {
            return;
        }
        if (this.y == null) {
            i = 1;
        } else {
            i = 0;
        }
        this.y = eqnVar;
        i(0, j, eqnVar, i);
    }

    public final void e(long j, eqn eqnVar) {
        int i;
        if (Objects.equals(this.z, eqnVar)) {
            return;
        }
        if (this.z == null) {
            i = 1;
        } else {
            i = 0;
        }
        this.z = eqnVar;
        i(2, j, eqnVar, i);
    }

    public final void f(long j, eqn eqnVar) {
        int i;
        if (Objects.equals(this.x, eqnVar)) {
            return;
        }
        if (this.x == null) {
            i = 1;
        } else {
            i = 0;
        }
        this.x = eqnVar;
        i(1, j, eqnVar, i);
    }

    public final void g(fbk fbkVar, String str) {
        fgv fgvVar = fbkVar.d;
        if ((fgvVar == null || !fgvVar.b()) && str.equals(this.g)) {
            b();
        }
        this.e.remove(str);
        this.f.remove(str);
    }

    public final boolean h(apuv apuvVar) {
        if (apuvVar != null) {
            fbx fbxVar = this.b;
            if (((String) apuvVar.c).equals(fbxVar.c())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
