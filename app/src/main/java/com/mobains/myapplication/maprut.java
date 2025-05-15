package com.mobains.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.mobains.myapplication.databinding.ActivityMaprutBinding;

public class maprut extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mMap;
    ActivityMaprutBinding binding;
    Button boton1, boton2, parada;
    int cod1, cod2, cod3, cod4, codparada;

    LatLng pterminal = new LatLng(-1.061815, -80.458862);
    LatLng pfterminal = new LatLng(-1.061535, -80.459163);
    LatLng p1utm = new LatLng(-1.047355, -80.455088);
    LatLng p2utm = new LatLng(-1.043949, -80.456527);
    LatLng p1futm = new LatLng(-1.046761, -80.455730);
    LatLng p2futm = new LatLng(-1.044133, -80.456838);
    LatLng pestrt = new LatLng(-1.049461, -80.454248);
    LatLng pshoping = new LatLng(-1.061701, -80.465215);
    LatLng p2 = new LatLng(-1.036668, -80.462865);
    LatLng ppetrolmar = new LatLng(-1.035555, -80.463888);
    LatLng pcpoli = new LatLng(-1.029957, -80.464751);
    LatLng pparkforest = new LatLng(-1.021970, -80.465099);
    LatLng pbvc = new LatLng(-1.016646, -80.465379);
    LatLng p3 = new LatLng(-1.058866, -80.457172);
    LatLng p4 = new LatLng(-1.051931, -80.453239);
    LatLng pcate = new LatLng(-1.052735, -80.453149);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaprutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);

        cod1 = getIntent().getExtras().getInt("rut1");
        cod2 = getIntent().getExtras().getInt("rut2");
        cod3 = getIntent().getExtras().getInt("rut3");
        cod4 = getIntent().getExtras().getInt("rut4");
        codparada = getIntent().getExtras().getInt("par");

        boton1 = findViewById(R.id.tipomap);
        boton1.setOnClickListener(v -> mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE));
        boton2 = findViewById(R.id.tipomap2);
        boton2.setOnClickListener(v -> mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL));

        parada = findViewById(R.id.paradas);
        parada.setOnClickListener(v -> {
            mMap.addMarker(new MarkerOptions().position(pterminal).title("Terminal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pfterminal).title("Terminal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p1utm).title("UTM PUERTA1").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p1futm).title("UTM PUERTA1").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p2utm).title("UTM PUERTA3").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p2futm).title("P.Rotonda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pestrt).title("Estadio Reales Tamarindo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pshoping).title("Shoping").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            //mMap.addMarker(new MarkerOptions().position(p1).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p2).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(ppetrolmar).title("Petrolmar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pcpoli).title("Cuartel de Policia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pparkforest).title("Parque Forestal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pbvc).title("Parada via Crucita").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            //mMap.addMarker(new MarkerOptions().position(pcsalud).title("Centro de salud").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p3).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p4).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pcate).title("Catedral").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        });


    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        mMap = googleMap;

        LatLng mapp = new LatLng(-1.0529148, -80.4688617);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mapp, 13), 4000, null);

        mMap.getUiSettings().setZoomControlsEnabled(true);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.
                checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        mMap.getMapType();
        mMap.setMyLocationEnabled(true);

        rutap();
        rutah();
        rutac();
        rutapi();
        paradaini();

    }

    private void rutap() {
        if (cod1 == 1) {
            PolylineOptions crp1 = new PolylineOptions();
            mMap.addPolyline(crp1);
        } else if (cod1 == 2) {
            PolylineOptions crp2 = new PolylineOptions()
                    .add(new LatLng(-1.0675673814607367, -80.4749085009098)).add(new LatLng(-1.0677202408326585, -80.4748199880123))
                    .add(new LatLng(-1.0628287371671423, -80.46686053276062)).add(new LatLng(-1.0623138415931739, -80.46591103076935))
                    .add(new LatLng(-1.0620939382489663, -80.465127825737)).add(new LatLng(-1.0620939382489663, -80.46449482440948))
                    .add(new LatLng(-1.0625230179304528, -80.46204328536987)).add(new LatLng(-1.0611285087478428, -80.46080410480499))
                    .add(new LatLng(-1.0619705778295119, -80.4583203792572)).add(new LatLng(-1.0605760683977754, -80.45822381973267))
                    .add(new LatLng(-1.0595999114216474, -80.45829892158508)).add(new LatLng(-1.0593210093719596, -80.45815944671631))
                    .add(new LatLng(-1.0586881161660964, -80.45733332633972)).add(new LatLng(-1.0589455642654237, -80.4568612575531))
                    .add(new LatLng(-1.0591708313348056, -80.45609951019287)).add(new LatLng(-1.0553949240115947, -80.45096576213837))
                    .add(new LatLng(-1.0522679972888156, -80.45313835144043)).add(new LatLng(-1.0440296299103446, -80.45657157897949))
                    .add(new LatLng(-1.0413478650304377, -80.45873880386353)).add(new LatLng(-1.0360057825961948, -80.46355605125427))
                    .add(new LatLng(-1.0348472575047092, -80.46434998512268)).add(new LatLng(-1.0340319988533222, -80.46457529067993))
                    .add(new LatLng(-0.9981027545076214, -80.46645686030388)).add(new LatLng(-0.9981175044188724, -80.46658426523209))
                    .add(new LatLng(-1.03405077125882, -80.46465575695038)).add(new LatLng(-1.0349759825357838, -80.46438753604889))
                    .add(new LatLng(-1.0361076898756432, -80.46356946229935)).add(new LatLng(-1.041953944093065, -80.4583740234375))
                    .add(new LatLng(-1.044152991039826, -80.45673787593842)).add(new LatLng(-1.0523484499882427, -80.45328855514526))
                    .add(new LatLng(-1.054689622632244, -80.45192867517471)).add(new LatLng(-1.0592620108582287, -80.45813530683517))
                    .add(new LatLng(-1.059492641405503, -80.45827478170395)).add(new LatLng(-1.059865404695608, -80.45829355716705))
                    .add(new LatLng(-1.0606457938842886, -80.45824259519576)).add(new LatLng(-1.0609515133066207, -80.45831233263016))
                    .add(new LatLng(-1.0612760049411367, -80.45856177806854)).add(new LatLng(-1.0614717726050003, -80.45881658792496))
                    .add(new LatLng(-1.0615549068146726, -80.4592028260231)).add(new LatLng(-1.0611124182536071, -80.46070486307144))
                    .add(new LatLng(-1.0616165870333116, -80.46456724405287)).add(new LatLng(-1.0617694467002872, -80.46526998281479))
                    .add(new LatLng(-1.0622441161442548, -80.46627044677734)).add(new LatLng(-1.0675700632041676, -80.47490648925304))
                    .width(10f).color(ContextCompat.getColor(this, R.color.purple_500));
            mMap.addPolyline(crp2);
        } else if (cod1 == 3) {
            PolylineOptions crp3 = new PolylineOptions();
            mMap.addPolyline(crp3);
        } else if (cod1 == 4) {
            PolylineOptions crp4 = new PolylineOptions();
            mMap.addPolyline(crp4);
        } else if (cod1 == 5) {
            PolylineOptions crp5 = new PolylineOptions();
            mMap.addPolyline(crp5);
        } else if (cod1 == 6) {
            PolylineOptions crp6 = new PolylineOptions();
            mMap.addPolyline(crp6);
        }
    }

    private void rutah() {

        if (cod2 == 1) {
            PolylineOptions crh1 = new PolylineOptions()
                    .add(new LatLng(-0.9952962474658575, -80.41596293449402)).add(new LatLng(-0.9934297111205511, -80.41767954826355)).add(new LatLng(-0.9921424440610409, -80.41869878768921)).add(new LatLng(-0.9880982767936237, -80.42312979698181))
                    .add(new LatLng(-0.9869504618437556, -80.42420268058777)).add(new LatLng(-0.9862424636397379, -80.42654156684875)).add(new LatLng(-0.9854271927940279, -80.42796850204468)).add(new LatLng(-0.9852341023013316, -80.4322600364685))
                    .add(new LatLng(-0.9850946480496495, -80.43459892272949))
                    .add(new LatLng(-0.9845368309845646, -80.43603658676147)).add(new LatLng(-0.9847084670145257, -80.43702363967896)).add(new LatLng(-0.9841291953779688, -80.4393196105957)).add(new LatLng(-0.9840219228416419, -80.44177651405334))
                    .add(new LatLng(-0.9850624662984305, -80.44386863708496)).add(new LatLng(-0.9842257406577192, -80.44623970985413)).add(new LatLng(-0.984622649000652, -80.44814944267272)).add(new LatLng(-0.9865320992868707, -80.45092821121216))
                    .add(new LatLng(-0.9866179172515477, -80.45268774032593)).add(new LatLng(-0.9880982767936237, -80.4553484916687)).add(new LatLng(-0.9893426364781334, -80.45700073242188)).add(new LatLng(-0.9900506340213971, -80.4580307006836))
                    .add(new LatLng(-0.9905226322995936, -80.45974731445312)).add(new LatLng(-0.9907371769492719, -80.46137809753418)).add(new LatLng(-0.9920458990113719, -80.46356678009033)).add(new LatLng(-0.9912735385126873, -80.4667854309082))
                    .add(new LatLng(-0.9923033524708753, -80.46751499176025)).add(new LatLng(-0.993805163918457, -80.4677939414978)).add(new LatLng(-0.9965298772293381, -80.46654939651489)).add(new LatLng(-1.0090377841207425, -80.46592712402344))
                    .add(new LatLng(-1.019056947603058, -80.4653263092041)).add(new LatLng(-1.0343109031523618, -80.4645323753357)).add(new LatLng(-1.0356196076127506, -80.46399593353271)).add(new LatLng(-1.0441798086760363, -80.45648574829102))
                    .add(new LatLng(-1.0487709846170805, -80.4547905921936)).add(new LatLng(-1.051071933579294, -80.45389473438263)).add(new LatLng(-1.0532763376383345, -80.45895874500275)).add(new LatLng(-1.0529706174604299, -80.45940935611725))
                    .add(new LatLng(-1.054402674877025, -80.46043395996094)).add(new LatLng(-1.0551535661431148, -80.4607504606247)).add(new LatLng(-1.056242358156981, -80.46168923377991)).add(new LatLng(-1.0571970621705142, -80.46374917030334))
                    .add(new LatLng(-1.0587256606819113, -80.46477913856506)).add(new LatLng(-1.0604205269221805, -80.46617388725281)).add(new LatLng(-1.061235778707297, -80.46672105789185)).add(new LatLng(-1.0621583002049804, -80.46616315841675))
                    .add(new LatLng(-1.0630915484166124, -80.46761155128479)).add(new LatLng(-1.0632417262634037, -80.46752572059631)).add(new LatLng(-1.062549835408564, -80.46640455722809)).add(new LatLng(-1.06221193516731, -80.46555161476135))
                    .add(new LatLng(-1.0620993017453442, -80.46475768089294)).add(new LatLng(-1.0625122909391345, -80.46202719211578)).add(new LatLng(-1.0611928707239708, -80.4608952999115)).add(new LatLng(-1.0617506744608778, -80.46519756317139))
                    .add(new LatLng(-1.0621559536753595, -80.46616449952126)).width(10f).color(ContextCompat.getColor(this, R.color.purple_500));
            mMap.addPolyline(crh1);
        } else if (cod2 == 2) {
            PolylineOptions crh2 = new PolylineOptions().add(new LatLng(-0.971428103202283, -80.45339584350586)).add(new LatLng(-0.9722326501599037, -80.45350849628447)).add(new LatLng(-0.9769741096639318, -80.45395374298096)).add(new LatLng(-0.9786422007280775, -80.45402884483337))
                    .add(new LatLng(-0.9798651094057027, -80.45437216758728)).add(new LatLng(-0.9807393815638793, -80.4549193382263)).add(new LatLng(-0.9812435629500685, -80.4550963640213)).add(new LatLng(-0.9829921063174077, -80.45547187328339))
                    .add(new LatLng(-0.9833031967592619, -80.45543968677521)).add(new LatLng(-0.9850463754227065, -80.45547723770142)).add(new LatLng(-0.9866286444969796, -80.45273065567017)).add(new LatLng(-0.986580371892275, -80.45109987258911))
                    .add(new LatLng(-0.9864087359587737, -80.45061707496643)).add(new LatLng(-0.988119731274895, -80.45104086399078)).add(new LatLng(-0.9883825486591973, -80.45118033885956)).add(new LatLng(-0.9885112755337215, -80.4517114162445))
                    .add(new LatLng(-0.9900023614664364, -80.45200109481812)).add(new LatLng(-0.9922550799487506, -80.4516738653183)).add(new LatLng(-0.9931400760758535, -80.45167922973633)).add(new LatLng(-0.9944273427467636, -80.45189380645752))
                    .add(new LatLng(-0.9974202358150803, -80.45175969600677)).add(new LatLng(-0.9980102323355963, -80.45197427272797)).add(new LatLng(-0.9989327721373465, -80.45193672180174)).add(new LatLng(-1.0001985821414734, -80.4511159658432))
                    .add(new LatLng(-1.0014536644601195, -80.4509174823761)).add(new LatLng(-1.0024566572496587, -80.45108377933502)).add(new LatLng(-1.0041998258051223, -80.4519259929657)).add(new LatLng(-1.0046020953398158, -80.4524302482605))
                    .add(new LatLng(-1.0050848187160737, -80.4536372423172)).add(new LatLng(-1.0082225189210132, -80.45601904392242)).add(new LatLng(-1.0111295820533885, -80.4588460922241)).add(new LatLng(-1.0127332928891062, -80.46034812927246))
                    .add(new LatLng(-1.0147553619421215, -80.46105623245239)).add(new LatLng(-1.0196630309070944, -80.4616516828537)).add(new LatLng(-1.0227256270951188, -80.46367406845093)).add(new LatLng(-1.0264801193093867, -80.464950799942))
                    .add(new LatLng(-1.0343109031523618, -80.4645323753357)).add(new LatLng(-1.0356196076127506, -80.46399593353271)).add(new LatLng(-1.0441798086760363, -80.45648574829102))
                    .add(new LatLng(-1.0487709846170805, -80.4547905921936)).add(new LatLng(-1.051071933579294, -80.45389473438263)).add(new LatLng(-1.0532763376383345, -80.45895874500275)).add(new LatLng(-1.0529706174604299, -80.45940935611725))
                    .add(new LatLng(-1.054402674877025, -80.46043395996094)).add(new LatLng(-1.0551535661431148, -80.4607504606247)).add(new LatLng(-1.056242358156981, -80.46168923377991)).add(new LatLng(-1.0571970621705142, -80.46374917030334))
                    .add(new LatLng(-1.0587256606819113, -80.46477913856506)).add(new LatLng(-1.0604205269221805, -80.46617388725281)).add(new LatLng(-1.061235778707297, -80.46672105789185)).add(new LatLng(-1.0621583002049804, -80.46616315841675))
                    .add(new LatLng(-1.0630915484166124, -80.46761155128479)).add(new LatLng(-1.0632417262634037, -80.46752572059631)).add(new LatLng(-1.062549835408564, -80.46640455722809)).add(new LatLng(-1.06221193516731, -80.46555161476135))
                    .add(new LatLng(-1.0620993017453442, -80.46475768089294)).add(new LatLng(-1.0625122909391345, -80.46202719211578)).add(new LatLng(-1.0611928707239708, -80.4608952999115)).add(new LatLng(-1.0617506744608778, -80.46519756317139))
                    .add(new LatLng(-1.0621559536753595, -80.46616449952126)).width(10f).color(ContextCompat.getColor(this, R.color.purple_500));
            mMap.addPolyline(crh2);
        } else if (cod2 == 3) {
            PolylineOptions crh3 = new PolylineOptions().add(new LatLng(-0.9873822334017802, -80.47133378684521)).add(new LatLng(-0.987191824833412, -80.47110512852669)).add(new LatLng(-0.9948886131816856, -80.46715021133423)).add(new LatLng(-0.9968946024622553, -80.46658158302306))
                    .add(new LatLng(-1.0100675925020062, -80.4658842086792)).add(new LatLng(-1.019078401881257, -80.46545505523682)).add(new LatLng(-1.0323505272237476, -80.4646959900856))
                    .add(new LatLng(-1.0343109031523618, -80.4645323753357))
                    .add(new LatLng(-1.0356196076127506, -80.46399593353271)).add(new LatLng(-1.0441798086760363, -80.45648574829102))
                    .add(new LatLng(-1.0487709846170805, -80.4547905921936)).add(new LatLng(-1.051071933579294, -80.45389473438263)).add(new LatLng(-1.0532763376383345, -80.45895874500275)).add(new LatLng(-1.0529706174604299, -80.45940935611725))
                    .add(new LatLng(-1.054402674877025, -80.46043395996094)).add(new LatLng(-1.0551535661431148, -80.4607504606247)).add(new LatLng(-1.056242358156981, -80.46168923377991)).add(new LatLng(-1.0571970621705142, -80.46374917030334))
                    .add(new LatLng(-1.0587256606819113, -80.46477913856506)).add(new LatLng(-1.0604205269221805, -80.46617388725281)).add(new LatLng(-1.061235778707297, -80.46672105789185)).add(new LatLng(-1.0621583002049804, -80.46616315841675))
                    .add(new LatLng(-1.0630915484166124, -80.46761155128479)).add(new LatLng(-1.0632417262634037, -80.46752572059631)).add(new LatLng(-1.062549835408564, -80.46640455722809)).add(new LatLng(-1.06221193516731, -80.46555161476135))
                    .add(new LatLng(-1.0620993017453442, -80.46475768089294)).add(new LatLng(-1.0625122909391345, -80.46202719211578)).add(new LatLng(-1.0611928707239708, -80.4608952999115)).add(new LatLng(-1.0617506744608778, -80.46519756317139))
                    .add(new LatLng(-1.0621559536753595, -80.46616449952126)).width(10f).color(ContextCompat.getColor(this, R.color.purple_500));
            mMap.addPolyline(crh3);
        } else if (cod2 == 4) {
            PolylineOptions crh4 = new PolylineOptions().add(new LatLng(-0.9751719267475725, -440.466388463974)).add(new LatLng(-0.9746462898818121, -440.46926379203796)).add(new LatLng(-0.9838931957934975, -440.47242879867554)).add(new LatLng(-0.9873902788339999, -440.4709911346435))
                    .add(new LatLng(-0.9960793342388108, -440.4666566848755)).add(new LatLng(-1.0004989437657092, -440.46637773513794)).add(new LatLng(-1.0218889110883331, -440.46536922454834)).add(new LatLng(-1.034377947451367, -440.4645122587681))
                    .add(new LatLng(-1.0343109031523618, -80.4645323753357))
                    .add(new LatLng(-1.0356196076127506, -80.46399593353271)).add(new LatLng(-1.0441798086760363, -80.45648574829102))
                    .add(new LatLng(-1.0487709846170805, -80.4547905921936)).add(new LatLng(-1.051071933579294, -80.45389473438263)).add(new LatLng(-1.0532763376383345, -80.45895874500275)).add(new LatLng(-1.0529706174604299, -80.45940935611725))
                    .add(new LatLng(-1.054402674877025, -80.46043395996094)).add(new LatLng(-1.0551535661431148, -80.4607504606247)).add(new LatLng(-1.056242358156981, -80.46168923377991)).add(new LatLng(-1.0571970621705142, -80.46374917030334))
                    .add(new LatLng(-1.0587256606819113, -80.46477913856506)).add(new LatLng(-1.0604205269221805, -80.46617388725281)).add(new LatLng(-1.061235778707297, -80.46672105789185)).add(new LatLng(-1.0621583002049804, -80.46616315841675))
                    .add(new LatLng(-1.0630915484166124, -80.46761155128479)).add(new LatLng(-1.0632417262634037, -80.46752572059631)).add(new LatLng(-1.062549835408564, -80.46640455722809)).add(new LatLng(-1.06221193516731, -80.46555161476135))
                    .add(new LatLng(-1.0620993017453442, -80.46475768089294)).add(new LatLng(-1.0625122909391345, -80.46202719211578)).add(new LatLng(-1.0611928707239708, -80.4608952999115)).add(new LatLng(-1.0617506744608778, -80.46519756317139))
                    .add(new LatLng(-1.0621559536753595, -80.46616449952126)).width(10f).color(ContextCompat.getColor(this, R.color.purple_500));
            mMap.addPolyline(crh4);
        }
    }

    private void rutac() {

        if (cod3 == 1) {
            PolylineOptions crc1 = new PolylineOptions();
            mMap.addPolyline(crc1);
        } else if (cod3 == 2) {
            PolylineOptions crc2 = new PolylineOptions();
            mMap.addPolyline(crc2);
        } else if (cod3 == 3) {
            PolylineOptions crc3 = new PolylineOptions();
            mMap.addPolyline(crc3);
        } else if (cod4 == 4) {
            PolylineOptions crc4 = new PolylineOptions();
            mMap.addPolyline(crc4);

        }
    }

    private void rutapi() {

        if (cod4 == 1) {
            PolylineOptions crpi1 = new PolylineOptions();
            mMap.addPolyline(crpi1);
        } else if (cod4 == 2) {
            PolylineOptions crpi2 = new PolylineOptions();
            mMap.addPolyline(crpi2);

        }
    }

    private void paradaini() {

        switch (codparada) {
            case 1:
            mMap.addMarker(new MarkerOptions().position(pterminal).title("Terminal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pfterminal).title("Terminal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p1utm).title("UTM PUERTA1").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p1futm).title("UTM PUERTA1").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p2utm).title("UTM PUERTA3").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p2futm).title("P.Rotonda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pestrt).title("Estadio Reales Tamarindo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pshoping).title("Shoping").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            //mMap.addMarker(new MarkerOptions().position(p1).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p2).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(ppetrolmar).title("Petrolmar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pcpoli).title("Cuartel de Policia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pparkforest).title("Parque Forestal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pbvc).title("Parada via Crucita").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            //mMap.addMarker(new MarkerOptions().position(pcsalud).title("Centro de salud").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p3).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(p4).title("Parada").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            mMap.addMarker(new MarkerOptions().position(pcate).title("Catedral").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        }
    }
}