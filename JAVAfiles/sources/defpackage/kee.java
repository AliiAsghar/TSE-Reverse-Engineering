package defpackage;

import defpackage.bwj;
import defpackage.cga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kee {
    private static final List a = aqjn.B("https://youtube.com/*", "https://www.youtube.com/*", "https://fonts.gstatic.com/*", "https://googleads.g.doubleclick.net/*", "https://static.doubleclick.net/*", "https://jnn-pa.googleapis.com/*", "https://www.google.com/*", "https://i.ytimg.com/*", "https://*.ggpht.com/*", "https://redirector.googlevideo.com/*", "https://play.google.com/*", "https://*.googlevideo.com/*");

    public static final void a(kef kefVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        kefVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(1909075848);
        if (i4 == 0) {
            if (true != c.G(kefVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 91) == 18 && c.L()) {
            c.v();
        } else {
            String str = kefVar.a;
            cga.a aVar = cga.e;
            String q = arsd.q("\n      <!DOCTYPE html>\n      <html>\n          <head>\n              <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n                  <style>\n                      body { margin: 0; width:100%; height:100%; background-color:#000; }\n                      html { width:100%; height:100%; background-color:#000; }\n\n                      #ytplayer {\n                          position: absolute;\n                          top: 0;\n                          left: 0;\n                          width: 100% !important;\n                          height: 100% !important;\n                          border: 0px;\n                      }\n                  </style>\n          </head>\n          <body>\n              <!-- https://developers.google.com/youtube/player_parameters#Manual_IFrame_Embeds -->\n              <!-- Iframe width and height values does not play role for this html piece -->\n              <iframe id=\"ytplayer\" type=\"text/html\" width=\"16\" height=\"9\"\n                src=\"https://www.youtube.com/embed/" + str + "?modestbranding=1&rel=0&enablejsapi=1&autoplay=1&mute=1\"\n                sandbox=\"allow-scripts allow-same-origin\" frameborder=\"0\" allowfullscreen></iframe>\n                \n              <!-- https://developers.google.com/youtube/iframe_api_reference#Example_Video_Player_Constructors -->\n              <script type=\"text/javascript\">\n                  var tag = document.createElement('script');\n                  tag.src = \"https://www.youtube.com/iframe_api\";\n                  var firstScriptTag = document.getElementsByTagName('script')[0];\n                  firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);\n\n                  var player;\n                  function onYouTubeIframeAPIReady() {\n                      player = new YT.Player('ytplayer', {});\n                  }\n              </script>\n          </body>\n      </html>\n    ");
            c.y(1310690006);
            c.y(-1738729793);
            boolean G = c.G(q) | c.G(null);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new adec(new afcf(q));
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bwkVar.Y();
            adom.bd((adec) T, a, amv.d(aVar, 200.0f), c, 64);
            cgaVar = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(kefVar, cgaVar, i, 15);
        }
    }
}
