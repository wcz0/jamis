package com.wcz0;

import com.wcz0.renderers.Action;
import com.wcz0.renderers.AjaxAction;
import com.wcz0.renderers.Alert;
import com.wcz0.renderers.AnchorNav;
import com.wcz0.renderers.AnchorNavSection;
import com.wcz0.renderers.ArrayControl;
import com.wcz0.renderers.Audio;
import com.wcz0.renderers.AutoFillHeight;
import com.wcz0.renderers.AutoGenerateFilter;
import com.wcz0.renderers.Avatar;
import com.wcz0.renderers.Badge;
import com.wcz0.renderers.Barcode;
import com.wcz0.renderers.BaseApi;
import com.wcz0.renderers.BaseRenderer;
import com.wcz0.renderers.Breadcrumb;
import com.wcz0.renderers.Button;
import com.wcz0.renderers.ButtonGroup;
import com.wcz0.renderers.ButtonGroupControl;
import com.wcz0.renderers.ButtonToolbar;
import com.wcz0.renderers.CRUD2Cards;
import com.wcz0.renderers.CRUD2List;
import com.wcz0.renderers.CRUD2Table;
import com.wcz0.renderers.CRUDCards;
import com.wcz0.renderers.CRUDList;
import com.wcz0.renderers.CRUDTable;
import com.wcz0.renderers.Calendar;
import com.wcz0.renderers.Card;
import com.wcz0.renderers.Card2;
import com.wcz0.renderers.Cards;
import com.wcz0.renderers.Carousel;
import com.wcz0.renderers.ChainedSelectControl;
import com.wcz0.renderers.Chart;
import com.wcz0.renderers.ChartRadios;
import com.wcz0.renderers.CheckboxControl;
import com.wcz0.renderers.CheckboxesControl;
import com.wcz0.renderers.Code;
import com.wcz0.renderers.Collapse;
import com.wcz0.renderers.CollapseGroup;
import com.wcz0.renderers.Color;
import com.wcz0.renderers.Column;
import com.wcz0.renderers.ComboCondition;
import com.wcz0.renderers.ComboControl;
import com.wcz0.renderers.ConditionBuilderControl;
import com.wcz0.renderers.Container;
import com.wcz0.renderers.CopyAction;
import com.wcz0.renderers.Custom;
import com.wcz0.renderers.Date;
import com.wcz0.renderers.DateControl;
import com.wcz0.renderers.DateRange;
import com.wcz0.renderers.DateRangeControl;
import com.wcz0.renderers.DateTimeControl;
import com.wcz0.renderers.Dialog;
import com.wcz0.renderers.DialogAction;
import com.wcz0.renderers.DiffControl;
import com.wcz0.renderers.Divider;
import com.wcz0.renderers.Drawer;
import com.wcz0.renderers.DrawerAction;
import com.wcz0.renderers.DropdownButton;
import com.wcz0.renderers.Each;
import com.wcz0.renderers.EditorControl;
import com.wcz0.renderers.EmailAction;
import com.wcz0.renderers.Expandable;
import com.wcz0.renderers.FieldSetControl;
import com.wcz0.renderers.FileControl;
import com.wcz0.renderers.Flex;
import com.wcz0.renderers.Form;
import com.wcz0.renderers.FormControl;
import com.wcz0.renderers.FormulaControl;
import com.wcz0.renderers.Grid;
import com.wcz0.renderers.Grid2D;
import com.wcz0.renderers.GridColumn;
import com.wcz0.renderers.GridNav;
import com.wcz0.renderers.GroupControl;
import com.wcz0.renderers.HBox;
import com.wcz0.renderers.HBoxColumn;
import com.wcz0.renderers.HiddenControl;
import com.wcz0.renderers.Html;
import com.wcz0.renderers.IFrame;
import com.wcz0.renderers.Icon;
import com.wcz0.renderers.IconChecked;
import com.wcz0.renderers.IconItem;
import com.wcz0.renderers.IconPickerControl;
import com.wcz0.renderers.Image;
import com.wcz0.renderers.ImageControl;
import com.wcz0.renderers.ImageToolbarAction;
import com.wcz0.renderers.Images;
import com.wcz0.renderers.InputCityControl;
import com.wcz0.renderers.InputColorControl;
import com.wcz0.renderers.InputDatetimeRange;
import com.wcz0.renderers.InputExcel;
import com.wcz0.renderers.InputGroupControl;
import com.wcz0.renderers.InputKV;
import com.wcz0.renderers.InputKVS;
import com.wcz0.renderers.InputSignature;
import com.wcz0.renderers.InputTimeRange;
import com.wcz0.renderers.InputYearRange;
import com.wcz0.renderers.JSONSchemaEditorControl;
import com.wcz0.renderers.Json;
import com.wcz0.renderers.Link;
import com.wcz0.renderers.LinkAction;
import com.wcz0.renderers.ListBodyField;
import com.wcz0.renderers.ListControl;
import com.wcz0.renderers.ListItem;
import com.wcz0.renderers.ListRenderer;
import com.wcz0.renderers.ListenerAction;
import com.wcz0.renderers.LocationControl;
import com.wcz0.renderers.Log;
import com.wcz0.renderers.Mapping;
import com.wcz0.renderers.Markdown;
import com.wcz0.renderers.MatrixControl;
import com.wcz0.renderers.MonthControl;
import com.wcz0.renderers.MonthRangeControl;
import com.wcz0.renderers.MultilineText;
import com.wcz0.renderers.Nav;
import com.wcz0.renderers.NavItem;
import com.wcz0.renderers.NavOverflow;
import com.wcz0.renderers.NestedSelectControl;
import com.wcz0.renderers.NumberControl;
import com.wcz0.renderers.Operation;
import com.wcz0.renderers.Option;
import com.wcz0.renderers.Options;
import com.wcz0.renderers.OtherAction;
import com.wcz0.renderers.Page;
import com.wcz0.renderers.Pagination;
import com.wcz0.renderers.PaginationWrapper;
import com.wcz0.renderers.Panel;
import com.wcz0.renderers.Password;
import com.wcz0.renderers.PickerControl;
import com.wcz0.renderers.Plain;
import com.wcz0.renderers.Portlet;
import com.wcz0.renderers.PortletTab;
import com.wcz0.renderers.Progress;
import com.wcz0.renderers.Property;
import com.wcz0.renderers.QRCode;
import com.wcz0.renderers.QRCodeImageSettings;
import com.wcz0.renderers.QuarterControl;
import com.wcz0.renderers.QuarterRangeControl;
import com.wcz0.renderers.RadioControl;
import com.wcz0.renderers.RadiosControl;
import com.wcz0.renderers.RangeControl;
import com.wcz0.renderers.RatingControl;
import com.wcz0.renderers.ReloadAction;
import com.wcz0.renderers.Remark;
import com.wcz0.renderers.RepeatControl;
import com.wcz0.renderers.RichTextControl;
import com.wcz0.renderers.RowSelection;
import com.wcz0.renderers.RowSelectionOptions;
import com.wcz0.renderers.SchemaApi;
import com.wcz0.renderers.SchemaCopyable;
import com.wcz0.renderers.SchemaMessage;
import com.wcz0.renderers.SchemaPopOver;
import com.wcz0.renderers.SearchBox;
import com.wcz0.renderers.SelectControl;
import com.wcz0.renderers.Service;
import com.wcz0.renderers.SparkLine;
import com.wcz0.renderers.Spinner;
import com.wcz0.renderers.State;
import com.wcz0.renderers.StaticExactControl;
import com.wcz0.renderers.Status;
import com.wcz0.renderers.Step;
import com.wcz0.renderers.Steps;
import com.wcz0.renderers.SubFormControl;
import com.wcz0.renderers.SvgIcon;
import com.wcz0.renderers.SwitchContainer;
import com.wcz0.renderers.SwitchControl;
import com.wcz0.renderers.Tab;
import com.wcz0.renderers.Table;
import com.wcz0.renderers.TableColumn;
import com.wcz0.renderers.TableControl;
import com.wcz0.renderers.TableView;
import com.wcz0.renderers.Tabs;
import com.wcz0.renderers.TabsTransferControl;
import com.wcz0.renderers.TabsTransferPickerControl;
import com.wcz0.renderers.Tag;
import com.wcz0.renderers.TagControl;
import com.wcz0.renderers.Tasks;
import com.wcz0.renderers.TextControl;
import com.wcz0.renderers.TextareaControl;
import com.wcz0.renderers.TimeControl;
import com.wcz0.renderers.Timeline;
import com.wcz0.renderers.TimelineItem;
import com.wcz0.renderers.Toast;
import com.wcz0.renderers.ToastAction;
import com.wcz0.renderers.TooltipWrapper;
import com.wcz0.renderers.Tpl;
import com.wcz0.renderers.TransferControl;
import com.wcz0.renderers.TransferPickerControl;
import com.wcz0.renderers.TreeControl;
import com.wcz0.renderers.TreeSelectControl;
import com.wcz0.renderers.UUIDControl;
import com.wcz0.renderers.UrlAction;
import com.wcz0.renderers.UserSelectControl;
import com.wcz0.renderers.VBox;
import com.wcz0.renderers.VanillaAction;
import com.wcz0.renderers.Video;
import com.wcz0.renderers.WebComponent;
import com.wcz0.renderers.Wizard;
import com.wcz0.renderers.WizardStep;
import com.wcz0.renderers.Words;
import com.wcz0.renderers.Wrapper;
import com.wcz0.renderers.YearControl;

public class Amis {

	public static Action Action(){
		return new Action();
	}

	public static AjaxAction AjaxAction(){
		return new AjaxAction();
	}

	public static Alert Alert(){
		return new Alert();
	}

	public static AnchorNav AnchorNav(){
		return new AnchorNav();
	}

	public static AnchorNavSection AnchorNavSection(){
		return new AnchorNavSection();
	}

	public static ArrayControl ArrayControl(){
		return new ArrayControl();
	}

	public static Audio Audio(){
		return new Audio();
	}

	public static AutoFillHeight AutoFillHeight(){
		return new AutoFillHeight();
	}

	public static AutoGenerateFilter AutoGenerateFilter(){
		return new AutoGenerateFilter();
	}

	public static Avatar Avatar(){
		return new Avatar();
	}

	public static Badge Badge(){
		return new Badge();
	}

	public static Barcode Barcode(){
		return new Barcode();
	}

	public static BaseApi BaseApi(){
		return new BaseApi();
	}

	public static BaseRenderer BaseRenderer(){
		return new BaseRenderer();
	}

	public static Breadcrumb Breadcrumb(){
		return new Breadcrumb();
	}

	public static Button Button(){
		return new Button();
	}

	public static ButtonGroup ButtonGroup(){
		return new ButtonGroup();
	}

	public static ButtonGroupControl ButtonGroupControl(){
		return new ButtonGroupControl();
	}

	public static ButtonToolbar ButtonToolbar(){
		return new ButtonToolbar();
	}

	public static CRUD2Cards CRUD2Cards(){
		return new CRUD2Cards();
	}

	public static CRUD2List CRUD2List(){
		return new CRUD2List();
	}

	public static CRUD2Table CRUD2Table(){
		return new CRUD2Table();
	}

	public static CRUDCards CRUDCards(){
		return new CRUDCards();
	}

	public static CRUDList CRUDList(){
		return new CRUDList();
	}

	public static CRUDTable CRUDTable(){
		return new CRUDTable();
	}

	public static Calendar Calendar(){
		return new Calendar();
	}

	public static Card Card(){
		return new Card();
	}

	public static Card2 Card2(){
		return new Card2();
	}

	public static Cards Cards(){
		return new Cards();
	}

	public static Carousel Carousel(){
		return new Carousel();
	}

	public static ChainedSelectControl ChainedSelectControl(){
		return new ChainedSelectControl();
	}

	public static Chart Chart(){
		return new Chart();
	}

	public static ChartRadios ChartRadios(){
		return new ChartRadios();
	}

	public static CheckboxControl CheckboxControl(){
		return new CheckboxControl();
	}

	public static CheckboxesControl CheckboxesControl(){
		return new CheckboxesControl();
	}

	public static Code Code(){
		return new Code();
	}

	public static Collapse Collapse(){
		return new Collapse();
	}

	public static CollapseGroup CollapseGroup(){
		return new CollapseGroup();
	}

	public static Color Color(){
		return new Color();
	}

	public static Column Column(){
		return new Column();
	}

	public static ComboCondition ComboCondition(){
		return new ComboCondition();
	}

	public static ComboControl ComboControl(){
		return new ComboControl();
	}

	public static ConditionBuilderControl ConditionBuilderControl(){
		return new ConditionBuilderControl();
	}

	public static Container Container(){
		return new Container();
	}

	public static CopyAction CopyAction(){
		return new CopyAction();
	}

	public static Custom Custom(){
		return new Custom();
	}

	public static Date Date(){
		return new Date();
	}

	public static DateControl DateControl(){
		return new DateControl();
	}

	public static DateRange DateRange(){
		return new DateRange();
	}

	public static DateRangeControl DateRangeControl(){
		return new DateRangeControl();
	}

	public static DateTimeControl DateTimeControl(){
		return new DateTimeControl();
	}

	public static Dialog Dialog(){
		return new Dialog();
	}

	public static DialogAction DialogAction(){
		return new DialogAction();
	}

	public static DiffControl DiffControl(){
		return new DiffControl();
	}

	public static Divider Divider(){
		return new Divider();
	}

	public static Drawer Drawer(){
		return new Drawer();
	}

	public static DrawerAction DrawerAction(){
		return new DrawerAction();
	}

	public static DropdownButton DropdownButton(){
		return new DropdownButton();
	}

	public static Each Each(){
		return new Each();
	}

	public static EditorControl EditorControl(){
		return new EditorControl();
	}

	public static EmailAction EmailAction(){
		return new EmailAction();
	}

	public static Expandable Expandable(){
		return new Expandable();
	}

	public static FieldSetControl FieldSetControl(){
		return new FieldSetControl();
	}

	public static FileControl FileControl(){
		return new FileControl();
	}

	public static Flex Flex(){
		return new Flex();
	}

	public static Form Form(){
		return new Form();
	}

	public static FormControl FormControl(){
		return new FormControl();
	}

	public static FormulaControl FormulaControl(){
		return new FormulaControl();
	}

	public static Grid Grid(){
		return new Grid();
	}

	public static Grid2D Grid2D(){
		return new Grid2D();
	}

	public static GridColumn GridColumn(){
		return new GridColumn();
	}

	public static GridNav GridNav(){
		return new GridNav();
	}

	public static GroupControl GroupControl(){
		return new GroupControl();
	}

	public static HBox HBox(){
		return new HBox();
	}

	public static HBoxColumn HBoxColumn(){
		return new HBoxColumn();
	}

	public static HiddenControl HiddenControl(){
		return new HiddenControl();
	}

	public static Html Html(){
		return new Html();
	}

	public static IFrame IFrame(){
		return new IFrame();
	}

	public static Icon Icon(){
		return new Icon();
	}

	public static IconChecked IconChecked(){
		return new IconChecked();
	}

	public static IconItem IconItem(){
		return new IconItem();
	}

	public static IconPickerControl IconPickerControl(){
		return new IconPickerControl();
	}

	public static Image Image(){
		return new Image();
	}

	public static ImageControl ImageControl(){
		return new ImageControl();
	}

	public static ImageToolbarAction ImageToolbarAction(){
		return new ImageToolbarAction();
	}

	public static Images Images(){
		return new Images();
	}

	public static InputCityControl InputCityControl(){
		return new InputCityControl();
	}

	public static InputColorControl InputColorControl(){
		return new InputColorControl();
	}

	public static InputDatetimeRange InputDatetimeRange(){
		return new InputDatetimeRange();
	}

	public static InputExcel InputExcel(){
		return new InputExcel();
	}

	public static InputGroupControl InputGroupControl(){
		return new InputGroupControl();
	}

	public static InputKV InputKV(){
		return new InputKV();
	}

	public static InputKVS InputKVS(){
		return new InputKVS();
	}

	public static InputSignature InputSignature(){
		return new InputSignature();
	}

	public static InputTimeRange InputTimeRange(){
		return new InputTimeRange();
	}

	public static InputYearRange InputYearRange(){
		return new InputYearRange();
	}

	public static JSONSchemaEditorControl JSONSchemaEditorControl(){
		return new JSONSchemaEditorControl();
	}

	public static Json Json(){
		return new Json();
	}

	public static Link Link(){
		return new Link();
	}

	public static LinkAction LinkAction(){
		return new LinkAction();
	}

	public static ListBodyField ListBodyField(){
		return new ListBodyField();
	}

	public static ListControl ListControl(){
		return new ListControl();
	}

	public static ListItem ListItem(){
		return new ListItem();
	}

	public static ListRenderer ListRenderer(){
		return new ListRenderer();
	}

	public static ListenerAction ListenerAction(){
		return new ListenerAction();
	}

	public static LocationControl LocationControl(){
		return new LocationControl();
	}

	public static Log Log(){
		return new Log();
	}

	public static Mapping Mapping(){
		return new Mapping();
	}

	public static Markdown Markdown(){
		return new Markdown();
	}

	public static MatrixControl MatrixControl(){
		return new MatrixControl();
	}

	public static MonthControl MonthControl(){
		return new MonthControl();
	}

	public static MonthRangeControl MonthRangeControl(){
		return new MonthRangeControl();
	}

	public static MultilineText MultilineText(){
		return new MultilineText();
	}

	public static Nav Nav(){
		return new Nav();
	}

	public static NavItem NavItem(){
		return new NavItem();
	}

	public static NavOverflow NavOverflow(){
		return new NavOverflow();
	}

	public static NestedSelectControl NestedSelectControl(){
		return new NestedSelectControl();
	}

	public static NumberControl NumberControl(){
		return new NumberControl();
	}

	public static Operation Operation(){
		return new Operation();
	}

	public static Option Option(){
		return new Option();
	}

	public static Options Options(){
		return new Options();
	}

	public static OtherAction OtherAction(){
		return new OtherAction();
	}

	public static Page Page(){
		return new Page();
	}

	public static Pagination Pagination(){
		return new Pagination();
	}

	public static PaginationWrapper PaginationWrapper(){
		return new PaginationWrapper();
	}

	public static Panel Panel(){
		return new Panel();
	}

	public static Password Password(){
		return new Password();
	}

	public static PickerControl PickerControl(){
		return new PickerControl();
	}

	public static Plain Plain(){
		return new Plain();
	}

	public static Portlet Portlet(){
		return new Portlet();
	}

	public static PortletTab PortletTab(){
		return new PortletTab();
	}

	public static Progress Progress(){
		return new Progress();
	}

	public static Property Property(){
		return new Property();
	}

	public static QRCode QRCode(){
		return new QRCode();
	}

	public static QRCodeImageSettings QRCodeImageSettings(){
		return new QRCodeImageSettings();
	}

	public static QuarterControl QuarterControl(){
		return new QuarterControl();
	}

	public static QuarterRangeControl QuarterRangeControl(){
		return new QuarterRangeControl();
	}

	public static RadioControl RadioControl(){
		return new RadioControl();
	}

	public static RadiosControl RadiosControl(){
		return new RadiosControl();
	}

	public static RangeControl RangeControl(){
		return new RangeControl();
	}

	public static RatingControl RatingControl(){
		return new RatingControl();
	}

	public static ReloadAction ReloadAction(){
		return new ReloadAction();
	}

	public static Remark Remark(){
		return new Remark();
	}

	public static RepeatControl RepeatControl(){
		return new RepeatControl();
	}

	public static RichTextControl RichTextControl(){
		return new RichTextControl();
	}

	public static RowSelection RowSelection(){
		return new RowSelection();
	}

	public static RowSelectionOptions RowSelectionOptions(){
		return new RowSelectionOptions();
	}

	public static SchemaApi SchemaApi(){
		return new SchemaApi();
	}

	public static SchemaCopyable SchemaCopyable(){
		return new SchemaCopyable();
	}

	public static SchemaMessage SchemaMessage(){
		return new SchemaMessage();
	}

	public static SchemaPopOver SchemaPopOver(){
		return new SchemaPopOver();
	}

	public static SearchBox SearchBox(){
		return new SearchBox();
	}

	public static SelectControl SelectControl(){
		return new SelectControl();
	}

	public static Service Service(){
		return new Service();
	}

	public static SparkLine SparkLine(){
		return new SparkLine();
	}

	public static Spinner Spinner(){
		return new Spinner();
	}

	public static State State(){
		return new State();
	}

	public static StaticExactControl StaticExactControl(){
		return new StaticExactControl();
	}

	public static Status Status(){
		return new Status();
	}

	public static Step Step(){
		return new Step();
	}

	public static Steps Steps(){
		return new Steps();
	}

	public static SubFormControl SubFormControl(){
		return new SubFormControl();
	}

	public static SvgIcon SvgIcon(){
		return new SvgIcon();
	}

	public static SwitchContainer SwitchContainer(){
		return new SwitchContainer();
	}

	public static SwitchControl SwitchControl(){
		return new SwitchControl();
	}

	public static Tab Tab(){
		return new Tab();
	}

	public static Table Table(){
		return new Table();
	}

	public static TableColumn TableColumn(){
		return new TableColumn();
	}

	public static TableControl TableControl(){
		return new TableControl();
	}

	public static TableView TableView(){
		return new TableView();
	}

	public static Tabs Tabs(){
		return new Tabs();
	}

	public static TabsTransferControl TabsTransferControl(){
		return new TabsTransferControl();
	}

	public static TabsTransferPickerControl TabsTransferPickerControl(){
		return new TabsTransferPickerControl();
	}

	public static Tag Tag(){
		return new Tag();
	}

	public static TagControl TagControl(){
		return new TagControl();
	}

	public static Tasks Tasks(){
		return new Tasks();
	}

	public static TextControl TextControl(){
		return new TextControl();
	}

	public static TextareaControl TextareaControl(){
		return new TextareaControl();
	}

	public static TimeControl TimeControl(){
		return new TimeControl();
	}

	public static Timeline Timeline(){
		return new Timeline();
	}

	public static TimelineItem TimelineItem(){
		return new TimelineItem();
	}

	public static Toast Toast(){
		return new Toast();
	}

	public static ToastAction ToastAction(){
		return new ToastAction();
	}

	public static TooltipWrapper TooltipWrapper(){
		return new TooltipWrapper();
	}

	public static Tpl Tpl(){
		return new Tpl();
	}

	public static TransferControl TransferControl(){
		return new TransferControl();
	}

	public static TransferPickerControl TransferPickerControl(){
		return new TransferPickerControl();
	}

	public static TreeControl TreeControl(){
		return new TreeControl();
	}

	public static TreeSelectControl TreeSelectControl(){
		return new TreeSelectControl();
	}

	public static UUIDControl UUIDControl(){
		return new UUIDControl();
	}

	public static UrlAction UrlAction(){
		return new UrlAction();
	}

	public static UserSelectControl UserSelectControl(){
		return new UserSelectControl();
	}

	public static VBox VBox(){
		return new VBox();
	}

	public static VanillaAction VanillaAction(){
		return new VanillaAction();
	}

	public static Video Video(){
		return new Video();
	}

	public static WebComponent WebComponent(){
		return new WebComponent();
	}

	public static Wizard Wizard(){
		return new Wizard();
	}

	public static WizardStep WizardStep(){
		return new WizardStep();
	}

	public static Words Words(){
		return new Words();
	}

	public static Wrapper Wrapper(){
		return new Wrapper();
	}

	public static YearControl YearControl(){
		return new YearControl();
	}

}